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
            h.setCommunity(rs.getString("hospital_community_name"));
    
	}
//        System.out.print(p.toString());
	closeConnection();
	return h;
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
            hospital.setCommunity(rs.getString("hospital_community_name"));
            hList.add(hospital);
        }
        closeConnection();
        return hList;	
    }
      
      
      
      
      
      
          public void closeConnection() throws Exception{
        conn.close();
    }
    
}
