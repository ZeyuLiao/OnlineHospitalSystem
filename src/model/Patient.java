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
    private String communityName;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
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
                ",phone:"+this.getPhoneNumber()+",communityName:"+this.getCommunityName()+",DOB:"+
                this.getDOB();
    }

   
}
