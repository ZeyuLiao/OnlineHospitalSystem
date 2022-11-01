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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import model.Encounter;

/**
 *
 * @author Ruolin
 */
public class EncounterDao {
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
    /*
        private int encounterId;
    private int doctorId;
    private int patientId;
    private Boolean state;
    private int vitalSignsId;
    private String symptom;
    private String diagnosis;
    private Date startDate;
    private Date endDate;
    
    */
	
    public ArrayList<Encounter> getEncounterByDoctorId(int id) throws Exception{
		
	ArrayList<Encounter> eList = new ArrayList<>();
	initConnection();
	String sql = "SELECT * FROM Encounter WHERE doctor_id=?";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, id+"");
	ResultSet rs = ps.executeQuery();
	if (rs.next()){
            Encounter e = new Encounter();
            e.setDoctorId(rs.getInt("doctor_id"));
            e.setDiagnosis(rs.getString("diagnosis"));
            e.setEncounterId(rs.getInt("encounter_id"));
            if(rs.getDate("end_date")!=null){
                e.setEndDate(rs.getDate("end_date").toLocalDate());
            }else{
                e.setEndDate(null);
            }
            e.setStartDate(rs.getDate("start_date").toLocalDate());
            e.setState(rs.getBoolean("state"));
            e.setSymptom(rs.getString("symptom"));
            e.setVitalSignsId(rs.getInt("vitalsign_id"));
            e.setPatientId(rs.getInt("patient_id"));
            eList.add(e);
	}
//        System.out.print(p.toString());
	closeConnection();
	return eList;
    }
    
    public ArrayList<Encounter> getAllEncounter() throws Exception{
		
        ArrayList<Encounter> eList = new ArrayList<>();
        initConnection();
        String sql = "SELECT * FROM Encounter";
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            Encounter e = new Encounter();
            e.setDoctorId(rs.getInt("doctor_id"));
            e.setDiagnosis(rs.getString("diagnosis"));
            e.setEncounterId(rs.getInt("encounter_id"));
            if(rs.getDate("end_date")!=null){
                e.setEndDate(rs.getDate("end_date").toLocalDate());
            }else{
                e.setEndDate(null);
            }
            e.setStartDate(rs.getDate("start_date").toLocalDate());
            e.setState(rs.getBoolean("state"));
            e.setSymptom(rs.getString("symptom"));
            e.setVitalSignsId(rs.getInt("vitalsign_id"));
            e.setPatientId(rs.getInt("patient_id"));
            eList.add(e);
        }
        closeConnection();
        return eList;	
    }

    public ArrayList<Encounter> getEncounterByPatientId(int id) throws Exception{
		
	ArrayList<Encounter> eList = new ArrayList<>();
	initConnection();
	String sql = "SELECT * FROM Encounter WHERE patient_id=?";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, id+"");
	ResultSet rs = ps.executeQuery();
	if (rs.next()){
            Encounter e = new Encounter();
            e.setDoctorId(rs.getInt("doctor_id"));
            e.setDiagnosis(rs.getString("diagnosis"));
            e.setEncounterId(rs.getInt("encounter_id"));
            if(rs.getDate("end_date")!=null){
                e.setEndDate(rs.getDate("end_date").toLocalDate());
            }else{
                e.setEndDate(null);
            }
            e.setStartDate(rs.getDate("start_date").toLocalDate());
            e.setState(rs.getBoolean("state"));
            e.setSymptom(rs.getString("symptom"));
            e.setVitalSignsId(rs.getInt("vitalsign_id"));
            e.setPatientId(rs.getInt("patient_id"));
            eList.add(e);
	}
//        System.out.print(p.toString());
	closeConnection();
	return eList;
    }

    public Encounter getEncounterByEncounterId(int id) throws Exception{
		
	initConnection();
        Encounter e = new Encounter();
	String sql = "SELECT * FROM Encounter WHERE encounter_id=?";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, id+"");
	ResultSet rs = ps.executeQuery();
	if (rs.next()){
            e.setDoctorId(rs.getInt("doctor_id"));
            e.setDiagnosis(rs.getString("diagnosis"));
            e.setEncounterId(rs.getInt("encounter_id"));
            if(rs.getDate("end_date")!=null){
                e.setEndDate(rs.getDate("end_date").toLocalDate());
            }else{
                e.setEndDate(null);
            }
            e.setStartDate(rs.getDate("start_date").toLocalDate());
            e.setState(rs.getBoolean("state"));
            e.setSymptom(rs.getString("symptom"));
            e.setVitalSignsId(rs.getInt("vitalsign_id"));
            e.setPatientId(rs.getInt("patient_id"));
	}
	closeConnection();
	return e;
    }
    
    public ArrayList<Encounter> getEncounterByState(int state) throws Exception{
		
	initConnection();
        ArrayList<Encounter> eList = new ArrayList();
	String sql = "SELECT * FROM Encounter WHERE state=?";
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setString(1, state+"");
	ResultSet rs = ps.executeQuery();
	if (rs.next()){
            Encounter e = new Encounter();
            e.setDoctorId(rs.getInt("doctor_id"));
            e.setDiagnosis(rs.getString("diagnosis"));
            e.setEncounterId(rs.getInt("encounter_id"));
            if(rs.getDate("end_date")!=null){
                e.setEndDate(rs.getDate("end_date").toLocalDate());
            }else{
                e.setEndDate(null);
            }
            e.setStartDate(rs.getDate("start_date").toLocalDate());
            e.setState(rs.getBoolean("state"));
            e.setSymptom(rs.getString("symptom"));
            e.setVitalSignsId(rs.getInt("vitalsign_id"));
            e.setPatientId(rs.getInt("patient_id"));
            eList.add(e);
	}
	closeConnection();
	return eList;
    }

    public boolean createEncounter(int patientId,int doctorId,int state,LocalDate startDate,String symptom) throws Exception{

        boolean res = true;
        LocalDate start = LocalDate.now();
        initConnection();
        String sql = "INSERT INTO Encounter( patient_id,doctor_id,start_date,state,symptom) "
                        + "VALUES('" + patientId + "','" + doctorId + 
                        "','" + startDate + "','" + state +"','"+ symptom+"')";
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
    //delete
    public boolean deleteEncounterByEncounterId(int encounterId) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "DELETE FROM Encounter WHERE encounter_id='" + encounterId + "'";

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
    public boolean updateEncounter(Encounter encounter) throws Exception{

        boolean res = true;
        initConnection();
        String sql = "UPDATE Encounter SET state='" + encounter.getState() + "', vitalsign_id='" + encounter.getVitalSignsId()
                + "', end_date='" + encounter.getEndDate() + "', diagnosis='" + encounter.getDiagnosis() + "'" + "where encounter_id = "+ encounter.getEncounterId() ;
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

