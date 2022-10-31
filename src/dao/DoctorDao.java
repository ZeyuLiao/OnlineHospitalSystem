/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Doctor;

/**
 *
 * @author ZeyuLiao
 */
public class DoctorDao {
    //CRUD of Doctor
    
    private Connection conn = null;

    // MySQL 8.0  - JDBC Driver+Database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //localhost:3306/+database name
    static final String DB_URL = "jdbc:mysql://localhost:3306/neu?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
 
    static final String USER = "root";
    static final String PASS = "123";
    
    public void initConnection() throws Exception{
		
	Class.forName(JDBC_DRIVER);   
    	conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}
	
    public Doctor getDoctorById(int id) throws Exception{
		
	Doctor doctor = new Doctor();
	initConnection();
	String sql = "SELECT * FROM doctorlist WHERE doctor_id=?";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, id+"");
	ResultSet rs = ps.executeQuery();
	if (rs.next()){
            doctor.setDoctorID(id);
            doctor.setName(rs.getString("doctor_name"));
            doctor.setHospitalName(rs.getString("hospital_name"));
            doctor.setDepartment(rs.getString("department"));
            doctor.setPhoneNumber(rs.getString("phone_number"));
            doctor.setPhotoAddress(rs.getString("photo_address"));
	}
//        System.out.print(doctor.toString());
	closeConnection();
	return doctor;
    }
    
    public ArrayList<Doctor> getAllDoctor() throws Exception{
		
        ArrayList<Doctor> doctorList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM doctorlist";
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            Doctor doctor = new Doctor();
            doctor.setDoctorID(rs.getInt("doctor_id"));
            doctor.setName(rs.getString("doctor_name"));
            doctor.setHospitalName(rs.getString("hospital_name"));
            doctor.setDepartment(rs.getString("department"));
            doctor.setPhoneNumber(rs.getString("phone_number"));
            doctor.setPhotoAddress(rs.getString("photo_address"));
            doctorList.add(doctor);
        }
        closeConnection();
        return doctorList;	
    }

    public ArrayList<Doctor> getDoctorByName(String name) throws Exception{

        ArrayList<Doctor> doctorList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM doctorlist WHERE name=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Doctor doctor = new Doctor();
            doctor.setDoctorID(rs.getInt("doctor_id"));
            doctor.setName(rs.getString("doctor_name"));
            doctor.setHospitalName(rs.getString("hospital_name"));
            doctor.setDepartment(rs.getString("department"));
            doctor.setPhoneNumber(rs.getString("phone_number"));
            doctor.setPhotoAddress(rs.getString("photo_address"));
            doctorList.add(doctor);
        }
        closeConnection();

        return doctorList;
    }
    
    public ArrayList<Doctor> getDoctorByDepartment(String department) throws Exception{

        ArrayList<Doctor> doctorList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM doctorlist WHERE department=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, department);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Doctor doctor = new Doctor();
            doctor.setDoctorID(rs.getInt("doctor_id"));
            doctor.setName(rs.getString("doctor_name"));
            doctor.setHospitalName(rs.getString("hospital_name"));
            doctor.setDepartment(rs.getString("department"));
            doctor.setPhoneNumber(rs.getString("phone_number"));
            doctor.setPhotoAddress(rs.getString("photo_address"));
            doctorList.add(doctor);
        }
        closeConnection();

        return doctorList;
    }
    public ArrayList<Doctor> getDoctorByHospitalName(String hospitalName) throws Exception{

        ArrayList<Doctor> doctorList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM doctorlist WHERE hospital_name=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, hospitalName);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Doctor doctor = new Doctor();
            doctor.setDoctorID(rs.getInt("doctor_id"));
            doctor.setName(rs.getString("doctor_name"));
            doctor.setHospitalName(rs.getString("hospital_name"));
            doctor.setDepartment(rs.getString("department"));
            doctor.setPhoneNumber(rs.getString("phone_number"));
            doctor.setPhotoAddress(rs.getString("photo_address"));
            doctorList.add(doctor);
        }
        closeConnection();

        return doctorList;
    }
    
    


//    public  ArrayList<Patient> getPatientByPhoneNumber(String phoneNumber) throws Exception{
//		
//        ArrayList<Patient> pList = new ArrayList<>();
//        initConnection();
//        String sql = "SELECT * FROM doctorlist WHERE phone_number=?";
//        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setString(1, phoneNumber);
//        ResultSet rs = ps.executeQuery();
//
//        //must have while(rs.next()){}
//        while(rs.next()){
//            Patient doctor = new Patient();
//            doctor.setPatientId(rs.getInt("patient_id"));
//            doctor.setName(rs.getString("name"));
//            doctor.setPhoneNumber(rs.getString("phone_umber"));
//            doctor.setDOB(rs.getString("DOB"));
//            doctor.setCommunityName(rs.getString("community_name"));
//            pList.add(doctor);
//        }
//
//        closeConnection();
//
//        return pList;
//    }

    public boolean addDoctor(Doctor doctor) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "INSERT INTO doctorlist( doctor_name,hospital_name,department,phone_number,photo_address ) "
                        + "VALUES('" + doctor.getName() + "','" + doctor.getHospitalName() + 
                        "','" + doctor.getDepartment() + "','" + doctor.getPhoneNumber()+ "','" + doctor.getPhotoAddress()+ "')";
        System.out.println(sql);
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
    //delete
    public boolean deletePatient(int id) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "DELETE FROM doctorlist WHERE doctor_id='" + id + "'";

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
	//update
    public boolean updatePatient(Doctor doctor) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "UPDATE doctorlist SET doctor_name='" + doctor.getName() + "', hospital_name='" + doctor.getHospitalName() 
                + "', department='" + doctor.getDepartment() + "', phone_number='" + doctor.getPhoneNumber()+ "', photo_address='" + doctor.getPhotoAddress()+ "'"+ "where doctor_id = "+ doctor.getDoctorID();
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
