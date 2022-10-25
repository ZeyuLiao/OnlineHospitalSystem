/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author ZeyuLiao
 */
public class Doctor extends User {
    private String title;
    private String DOB;
    private ImageIcon photoDoctor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public ImageIcon getPhotoDoctor() {
        return photoDoctor;
    }

    public void setPhotoDoctor(ImageIcon photoDoctor) {
        this.photoDoctor = photoDoctor;
    }
    
    @Override
    public String toString(){
        return "id:"+this.getTitle()+",name:"+this.getName()+
                ",phone:"+this.getPhoneNumber()+",address:"+
                this.getDOB();
    }

   
}
