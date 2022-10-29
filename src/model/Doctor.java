/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ZeyuLiao
 */
public class Doctor extends User {
    private int doctorID;
    private String hospitalName;
    private String department;
    private String photoAddress;

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhotoAddress() {
        return photoAddress;
    }

    public void setPhotoAddress(String photoAddress) {
        this.photoAddress = photoAddress;
    }  
    
    @Override
    public String toString(){
        return "id:"+this.getDoctorID()+",name:"+this.getName()+"hospital:"+this.getHospitalName()+
                ",phone:"+this.getPhoneNumber()+",photo:"+
                this.getPhotoAddress();
    }

   
}
