/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author ziyu
 */
public enum UserType {
    SYSADMIN("admin",0),
    PATIENT("patient",1),
    DOCTOR("doctor",2),
    COMMUNITYADMIN("comAdmin",3),;
    
    private String name;
    private int index;
    
    private UserType(String name, int index){
    this.name = name;
    this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
