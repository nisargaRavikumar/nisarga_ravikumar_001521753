/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nisar
 */
public class PatientDirectory {
    public Patient patient;
    public ArrayList<Patient> patientlist;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ArrayList<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }
    
    public PatientDirectory(){
        this.patientlist= new ArrayList<Patient>();
    }
    
    public String addPattient(Patient patient){
        this.patient = patient;
        this.patientlist.add(patient);
        
        return "Patient added to directory successfully";
    }
    
    public Patient getPatient(int id){
        Patient patient = null;
        for(Patient p: this.patientlist){
            if(p.getUniqueID()==id){
                patient = p;
            }
        
        }
        return patient;
    }

}


