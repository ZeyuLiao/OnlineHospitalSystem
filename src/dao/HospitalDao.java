/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Hospital;


/**
 *
 * @author ziyu
 */
public class HospitalDao {
     private Connection conn = null;

    // MySQL 8.0  - JDBC Driver+Database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //localhost:3306/+database name
    static final String DB_URL = "jdbc:mysql://localhost:3306/neu?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
 
    static final String USER = "root";
    static final String PASS = "123";
    
    public void initConnection() throws Exception{
		
	Class.forName(JDBC_DRIVER);  
    	String url = "jdbc:mysql://localhost:3306/javaweb?serverTimezone=CTT";  
    	conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}
    
    
          
      public ArrayList<Hospital> getAllHospital() throws Exception{
		
        ArrayList<Hospital> hList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM HospitalList";
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            Hospital hospital = new Hospital();
            hospital.setHospitalId(rs.getInt("hospital_id"));
            hospital.setHospitalName(rs.getString("hospital_name"));
            hospital.setCommunity(rs.getString("hospital_communityname"));
            hList.add(hospital);
        }
        closeConnection();
        return hList;	
    }
      
      
      public Hospital getHospitalById(int id) throws Exception{
		
	Hospital h = null;
	initConnection();
	String sql = "SELECT * FROM HospitalList WHERE hospital_id=?";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, id+"");
	ResultSet rs = ps.executeQuery();
	if (rs.next()){
            h = new Hospital();
            h.setHospitalId(id);
            h.setHospitalName(rs.getString("hospital_name"));
            h.setCommunity(rs.getString("hospital_communityname"));
    
	}
//        System.out.print(p.toString());
	closeConnection();
	return h;
    }
      
       public ArrayList<Hospital> getHospitalByName(String name) throws Exception{

        ArrayList<Hospital> hList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM hospitallist WHERE hospital_name=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Hospital hospital = new Hospital();
            hospital.setHospitalId(rs.getInt("hospital_id"));
            hospital.setHospitalName(rs.getString("hospital_name"));
            hospital.setCommunity(rs.getString("hospital_communityname"));
            hList.add(hospital);
        }
        closeConnection();

        return hList;
    }
       

        public ArrayList<Hospital> getHospitalByCommunity(String community) throws Exception{

        ArrayList<Hospital> hList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM hospitallist WHERE hospital_communityname=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, community);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Hospital hospital = new Hospital();
            hospital.setHospitalId(rs.getInt("hospital_id"));
            hospital.setHospitalName(rs.getString("hospital_name"));
            hospital.setCommunity(rs.getString("hospital_communityname"));
            hList.add(hospital);
        }
        closeConnection();

        return hList;
    }
      
        
        public boolean addHospital(Hospital hospital) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "INSERT INTO HospitalList(hospital_name,hospital_communityname) "
                        + "VALUES('" + hospital.getHospitalName() + "','" + hospital.getCommunity()+ "');";
        //System.out.println(sql);
        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
        }catch(Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            closeConnection();
        }
        return res;
    }
        
        
        
        public boolean deleteHospital(int hospitalId) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "DELETE FROM HospitalList WHERE hospital_id='" + hospitalId + "'";

        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
        }catch(Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            closeConnection();
        }
        return res;
    }
        
        
        public boolean updateHospital(Hospital hospital) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "UPDATE HospitalList SET hospital_name='" + hospital.getHospitalName() + "', hospital_communityname='" + hospital.getCommunity() + "'"+ "where hospital_id = "+ hospital.getHospitalId();
        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate(sql);
        }catch(Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            closeConnection();
        }
        return res;
    }
      
      
      
      
      
      
      
          public void closeConnection() throws Exception{
        conn.close();
    }
    
}

