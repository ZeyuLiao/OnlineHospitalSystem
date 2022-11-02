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
import model.Community;


/**
 *
 * @author ziyu
 */
public class CommunityDao {
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
    
    public ArrayList<String> getCommunityNames() throws Exception{
		
        ArrayList<String> communityNames = new ArrayList<String>();
        initConnection();
        String sql = "SELECT community_name FROM CommunityList";
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        int index = 1;
        while(rs.next()){
            communityNames.add(rs.getString("community_name"));
            index++;
        }
        closeConnection();
        return communityNames;	
    }
          
      public ArrayList<Community> getAllCommunity() throws Exception{
		
        ArrayList<Community> cList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM CommunityList";
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            Community community = new Community();
            community.setCommunityId(rs.getInt("communityId"));
            community.setCommunityName(rs.getString("community_name"));
            community.setBelongToCity(rs.getString("city_name"));
            cList.add(community);
        }
        closeConnection();
        return cList;	
    }
      
        public Community getCommunityById(int id) throws Exception{

   
        Community community = null;
        initConnection();
        String sql = "SELECT * FROM CommunityList WHERE communityId=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, id+"");
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            community = new Community();
            community.setCommunityId(id);
            community.setCommunityName(rs.getString("community_name"));
            community.setBelongToCity(rs.getString("city_name"));
           
        }
        closeConnection();

        return community;
    }
      
       public ArrayList<Community> getCommunityByName(String name) throws Exception{

        ArrayList<Community> cList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM CommunityList WHERE community_name like" +"'" + name +"'";
        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Community community = new Community();
            community.setCommunityId(rs.getInt("communityId"));
            community.setCommunityName(rs.getString("community_name"));
            community.setBelongToCity(rs.getString("city_name"));
            cList.add(community);
        }
        closeConnection();

        return cList;
    }
       

        public ArrayList<Community> getCommunityByCity(String city) throws Exception{

        ArrayList<Community> cList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM CommunityList WHERE city_name like" +"'" + city +"'";
        PreparedStatement ps = conn.prepareStatement(sql);
 
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Community community = new Community();
            community.setCommunityId(rs.getInt("communityId"));
            community.setCommunityName(rs.getString("community_name"));
            community.setBelongToCity(rs.getString("city_name"));
            cList.add(community);
        }
        closeConnection();

        return cList;
    }
      
        
        public boolean addCommunity(Community community) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "INSERT INTO CommunityList(community_name) VALUES('" + community.getCommunityName() + "');";
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
        
        
        
        public boolean deleteCommunityById(int communityId) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "DELETE FROM CommunityList WHERE communityId='" + communityId + "'";

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
        
        
        public boolean updateCommunity(Community community) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "UPDATE CommunityList SET community_name='" + community.getCommunityName() +  "'"+ "where communityId= "+community.getCommunityId();
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
    
    
