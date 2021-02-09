/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nisar
 */
public class DriverLicInfo {
    private String LicNo;
    private String IssuedDate;
    private String ExpireyDate;
    private String picture;
    private String BloodType;

    public String getLicNo() {
        return LicNo;
    }

    public void setLicNo(String LicNo) {
        this.LicNo = LicNo;
    }

    public String getIssuedDate() {
        return IssuedDate;
    }

    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    public String getExpireyDate() {
        return ExpireyDate;
    }

    public void setExpireyDate(String ExpireyDate) {
        this.ExpireyDate = ExpireyDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }
    
    
}
