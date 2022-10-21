/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import model.Patient;

/**
 *
 * @author Ruolin
 */
public class PatientDao {
    //CRUD of Patient
    
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
	
    public Patient getPatientById(int id) throws Exception{
		
	Patient p = null;
	initConnection();
	String sql = "SELECT * FROM Patient WHERE patientId=?";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, id+"");
	ResultSet rs = ps.executeQuery();
	if (rs.next()){
            p = new Patient();
            p.setPatientId(id);
            p.setAddress(rs.getString("Name"));
            p.setName(rs.getString("PhoneNumber"));
            p.setPhoneNumber(rs.getString("DOB"));
            p.setPhoneNumber(rs.getString("Address"));
	}
        System.out.print(p.toString());
	closeConnection();
	return p;
	}
	
	public void closeConnection() throws Exception{
		conn.close();
	}
    
}
