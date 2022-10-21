/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ruolin
 */
public class Patient extends User {
    private int patientId;
    private String DOB;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getDOB() {
        return DOB;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    @Override
    public String toString(){
        return "id:"+this.getPatientId()+",name:"+this.getName()+
                ",phone:"+this.getPhoneNumber()+",address:"+this.getAddress()+",DOB:"+
                this.getDOB();
    }

   
}
