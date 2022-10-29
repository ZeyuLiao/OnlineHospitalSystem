/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ziyu
 */
public class Community {
   private int communityId;
   private String communityName;
   private String belongToCity;
   

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getBelongToCity() {
        return belongToCity;
    }

    public void setBelongToCity(String belongToCity) {
        this.belongToCity = belongToCity;
    }

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityNo) {
        this.communityId = communityNo;
    }
    
   
  
    
}
