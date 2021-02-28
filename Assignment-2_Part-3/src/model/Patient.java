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
public class Patient extends Person {
    public EncounterHistory enhistory;

    public EncounterHistory getEnhistory() {
        return enhistory;
    }

    public void setEnhistory(EncounterHistory enhistory) {
        this.enhistory = enhistory;
    }
    public Patient(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.uniqueID = person.uniqueID;
        enhistory = new EncounterHistory();
    }
    public String isVitalNormal(String VSign){
        String out = null;
        double ageCheck= this.age;
        if(ageCheck == 0) {
            if(VSign.equals("R")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() >= 30 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() <= 50) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("H")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() >= 120 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() <= 160) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("B")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() >= 50 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() <= 70) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WK")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() >= 2 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() <= 3) {
                   out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WP")) {
               if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() >= 4.5 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() <= 7) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            }
        } else if(ageCheck > 0 && ageCheck <= 1) {
            if(VSign.equals("R")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() >= 20 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() <= 30) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("H")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() >= 80 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() <= 140) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("B")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() >= 70 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() <= 100) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WK")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() >= 4 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() <= 10) {
                   out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WP")) {
               if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() >= 9 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() <= 22) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            }
        } else if(ageCheck > 1 && ageCheck <= 3) {
            if(VSign.equals("R")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() >= 20 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() <= 30) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("H")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() >= 80 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() <= 130) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("B")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() >= 80 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() <= 110) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WK")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() >= 10 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() <= 14) {
                   out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WP")) {
               if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() >= 22 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() <= 31) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            }
        } else if(ageCheck > 0 && ageCheck <= 5) {
            if(VSign.equals("R")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() >= 20 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() <= 30) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("H")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() >= 80 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() <= 120) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("B")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() >= 80 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() <= 110) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WK")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() >= 14 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() <= 18) {
                   out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WP")) {
               if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() >= 31 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() <= 40) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            }
        } else if(ageCheck > 5 && ageCheck <= 12) {
            if(VSign.equals("R")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() >= 20 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() <= 30) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("H")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() >= 70 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() <= 110) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("B")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() >= 80 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() <= 120) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WK")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() >= 20 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() <= 42) {
                   out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WP")) {
               if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() >= 41 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() <= 92) {
                    out="Normal";
                } else {
                    System.out.println("ABNormal");
                }
            }
        } else if(ageCheck > 13) {
            if(VSign.equals("R")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() >= 12 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getResprt() <= 20) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("H")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() >= 55 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getHeartrt() <= 105) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("B")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() >= 110 && this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getBp() <= 120) {
                    out="Normal";
                } else {
                    out="AbNormal";
                }
            } else if (VSign.equals("WK")) {
                if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getKilos() > 50) {
                   out="Normal";
                } else {
                    System.out.println("ABNormal");
                }
            } else if (VSign.equals("WP")) {
               if(this.enhistory.enHistory.get(this.enhistory.enHistory.size()-1).getPatientvitalslist().getPound() > 110) {
                    out="Normal";
                } else {
                    System.out.println("ABNormal");
                }
            }
        }
        return out;
    }
    
}
