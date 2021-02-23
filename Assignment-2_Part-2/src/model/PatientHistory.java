/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nisar
 */
public class PatientHistory {
    public VitalSigns vitalsigns;
    public String CurrentName;
    public ArrayList<VitalSigns> patientvitalslist;
    public int j;
    public PatientHistory() {
    this.patientvitalslist = new ArrayList<VitalSigns>();
    }
    public String PatientHistory(VitalSigns vitals){
        this.vitalsigns = vitals;
        this.patientvitalslist.add(vitals);
        return "record added";
    }
    public String History(String Name) {
        boolean isCheck = true;
        this.CurrentName = Name;
        if(this.patientvitalslist.size() > 0) {
            System.out.println("|||||||||||||||||||||||||||||||||||||||Records||||||||||||||||||||||||||");
            System.out.println("records for the patient "+this.CurrentName);
            
        for(int i= 0; i< this.patientvitalslist.size();i++) {
            if(this.CurrentName.equals(this.patientvitalslist.get(i).getName())) {
                j = i;
                System.out.println("The age of the patient is "+patientvitalslist.get(i).getAge()+" years");
                System.out.println("The heart rate is "+patientvitalslist.get(i).getHeartrt());
                System.out.println("The Respiratory rate is "+patientvitalslist.get(i).getResprt());
                System.out.println("The Blood pressure is "+patientvitalslist.get(i).getBp());
                System.out.println("The weight in kilos is "+patientvitalslist.get(i).getKilos());
                System.out.println("The weight in Pounds is "+patientvitalslist.get(i).getPound());
                System.out.println("|||||||||||||||||||||||||||||||||||||||Record Ends||||||||||||||||||||||||||");
            }
            if(this.patientvitalslist.size() == i+1 && !this.CurrentName.equals(this.patientvitalslist.get(i).getName())) {
            System.out.println("|||||||||||||||||||||||||||||||||||||||No Record's Found||||||||||||||||||||||||||");
            }
        }
        
    } else {
        isCheck = false;    
        System.out.println("|||||||||||||||||||||||||||||||||||||||No Saved Records||||||||||||||||||||||||||");
    }
        if(isCheck == false){
            return "NA";
        }else{
        return null;
        }
    }
    public void isVitalNormal(String VSign){
        double ageCheck= patientvitalslist.get(j).getAge();
        if(ageCheck == 0) {
            if(VSign.equals("R")) {
                if(patientvitalslist.get(j).getResprt() >= 30 && patientvitalslist.get(j).getResprt() <= 50) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("H")) {
                if(patientvitalslist.get(j).getHeartrt() >= 120 && patientvitalslist.get(j).getHeartrt() <= 160) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("B")) {
                if(patientvitalslist.get(j).getBp() >= 50 && patientvitalslist.get(j).getBp() <= 70) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WK")) {
                if(patientvitalslist.get(j).getKilos() >= 2 && patientvitalslist.get(j).getKilos() <= 3) {
                   System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WP")) {
               if(patientvitalslist.get(j).getPound() >= 4.5 && patientvitalslist.get(j).getPound() <= 7) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            }
        } else if(ageCheck > 0 && ageCheck <= 1) {
            if(VSign.equals("R")) {
                if(patientvitalslist.get(j).getResprt() >= 20 && patientvitalslist.get(j).getResprt() <= 30) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("H")) {
                if(patientvitalslist.get(j).getHeartrt() >= 80 && patientvitalslist.get(j).getHeartrt() <= 140) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("B")) {
                if(patientvitalslist.get(j).getBp() >= 70 && patientvitalslist.get(j).getBp() <= 100) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WK")) {
                if(patientvitalslist.get(j).getKilos() >= 4 && patientvitalslist.get(j).getKilos() <= 10) {
                   System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WP")) {
               if(patientvitalslist.get(j).getPound() >= 9 && patientvitalslist.get(j).getPound() <= 22) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            }
        } else if(ageCheck > 1 && ageCheck <= 3) {
            if(VSign.equals("R")) {
                if(patientvitalslist.get(j).getResprt() >= 20 && patientvitalslist.get(j).getResprt() <= 30) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("H")) {
                if(patientvitalslist.get(j).getHeartrt() >= 80 && patientvitalslist.get(j).getHeartrt() <= 130) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("B")) {
                if(patientvitalslist.get(j).getBp() >= 80 && patientvitalslist.get(j).getBp() <= 110) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WK")) {
                if(patientvitalslist.get(j).getKilos() >= 10 && patientvitalslist.get(j).getKilos() <= 14) {
                   System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WP")) {
               if(patientvitalslist.get(j).getPound() >= 22 && patientvitalslist.get(j).getPound() <= 31) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            }
        } else if(ageCheck > 0 && ageCheck <= 5) {
            if(VSign.equals("R")) {
                if(patientvitalslist.get(j).getResprt() >= 20 && patientvitalslist.get(j).getResprt() <= 30) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("H")) {
                if(patientvitalslist.get(j).getHeartrt() >= 80 && patientvitalslist.get(j).getHeartrt() <= 120) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("B")) {
                if(patientvitalslist.get(j).getBp() >= 80 && patientvitalslist.get(j).getBp() <= 110) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WK")) {
                if(patientvitalslist.get(j).getKilos() >= 14 && patientvitalslist.get(j).getKilos() <= 18) {
                   System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WP")) {
               if(patientvitalslist.get(j).getPound() >= 31 && patientvitalslist.get(j).getPound() <= 40) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            }
        } else if(ageCheck > 5 && ageCheck <= 12) {
            if(VSign.equals("R")) {
                if(patientvitalslist.get(j).getResprt() >= 20 && patientvitalslist.get(j).getResprt() <= 30) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("H")) {
                if(patientvitalslist.get(j).getHeartrt() >= 70 && patientvitalslist.get(j).getHeartrt() <= 110) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("B")) {
                if(patientvitalslist.get(j).getBp() >= 80 && patientvitalslist.get(j).getBp() <= 120) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WK")) {
                if(patientvitalslist.get(j).getKilos() >= 20 && patientvitalslist.get(j).getKilos() <= 42) {
                   System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WP")) {
               if(patientvitalslist.get(j).getPound() >= 41 && patientvitalslist.get(j).getPound() <= 92) {
                    System.out.println("Normal");
                } else {
                    System.out.println("ABNormal");
                }
            }
        } else if(ageCheck > 13) {
            if(VSign.equals("R")) {
                if(patientvitalslist.get(j).getResprt() >= 12 && patientvitalslist.get(j).getResprt() <= 20) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("H")) {
                if(patientvitalslist.get(j).getHeartrt() >= 55 && patientvitalslist.get(j).getHeartrt() <= 105) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("B")) {
                if(patientvitalslist.get(j).getBp() >= 110 && patientvitalslist.get(j).getBp() <= 120) {
                    System.out.println("Normal");
                } else {
                    System.out.println("AbNormal");
                }
            } else if (VSign.equals("WK")) {
                if(patientvitalslist.get(j).getKilos() > 50) {
                   System.out.println("Normal");
                } else {
                    System.out.println("ABNormal");
                }
            } else if (VSign.equals("WP")) {
               if(patientvitalslist.get(j).getPound() > 110) {
                    System.out.println("Normal");
                } else {
                    System.out.println("ABNormal");
                }
            }
        }
    }
}
