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
public class Person {
 public DemographicInfo demographicinfovar;
 public AddressInfo addressinfovar;
 public BankDetails bankdetailsvar;
 public DriverLicInfo driverlicensevar;
 public MedicalRec medicalinfovar;
 public CheckingAccInfo savingsvar;

    public CheckingAccInfo getSavingsvar() {
        return savingsvar;
    }

    public void setSavingsvar(CheckingAccInfo savingsvar) {
        this.savingsvar = savingsvar;
    }

    public DemographicInfo getDemographicinfovar() {
        return demographicinfovar;
    }

    public void setDemographicinfovar(DemographicInfo demographicinfovar) {
        this.demographicinfovar = demographicinfovar;
    }

    public AddressInfo getAddressinfovar() {
        return addressinfovar;
    }

    public void setAddressinfovar(AddressInfo addressinfovar) {
        this.addressinfovar = addressinfovar;
    }

    public BankDetails getBankdetailsvar() {
        return bankdetailsvar;
    }

    public void setBankdetailsvar(BankDetails bankdetailsvar) {
        this.bankdetailsvar = bankdetailsvar;
    }

    public DriverLicInfo getDriverlicensevar() {
        return driverlicensevar;
    }

    public void setDriverlicensevar(DriverLicInfo driverlicensevar) {
        this.driverlicensevar = driverlicensevar;
    }

    public MedicalRec getMedicalinfovar() {
        return medicalinfovar;
    }

    public void setMedicalinfovar(MedicalRec medicalinfovar) {
        this.medicalinfovar = medicalinfovar;
    }
 
}
