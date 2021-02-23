/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.VitalSigns;

/**
 *
 * @author nisar
 */
public class isPatientNormal {
    boolean normal;
    VitalSigns vitals;
    public boolean checkvital (VitalSigns vitals){
        this.vitals = vitals;
        boolean isResp=false;
        boolean isHeart=false;
        boolean isBp=false;
        boolean isKilos=false;
        boolean isPound=false;
        if (vitals.getAge() == 0){ 
            if (vitals.getResprt() >=30 && vitals.getResprt()<=50){
                isResp= true;
            }
            if (vitals.getHeartrt()>=120 && vitals.getHeartrt()<=160){
                isHeart= true;
            }
            if (vitals.getBp()>=50 && vitals.getBp()<=70){
                isBp= true;
            }
            if(vitals.getKilos()>=2 && vitals.getKilos()<=3){
                isKilos=true;
            } 
            
            if(vitals.getPound()>=4.5 && vitals.getPound()<=7){
                isPound=true;
            }
        }
        if(vitals.getAge()>0 && vitals.getAge()<=1){
            if (vitals.getResprt()>=20 && vitals.getResprt()<30){
                isResp= true;
            }
            if (vitals.getHeartrt()>=80 && vitals.getHeartrt()<140){
                isHeart= true;
            }
            if (vitals.getBp()>=70 && vitals.getBp()<=100){
                isBp= true;
            }
            if(vitals.getKilos()>=4 && vitals.getKilos()<=10){
                isKilos=true;
            } 
            
            if(vitals.getPound()>=9 && vitals.getPound()<=22){
                isPound=true;
            }
        }
        

        if(vitals.getAge()>1 && vitals.getAge()<=3){
            if (vitals.getResprt()>=20 && vitals.getResprt()<30){
                isResp= true;
            }
            if (vitals.getHeartrt()>=80 && vitals.getHeartrt()<=130){
                isHeart= true;
            }
            if (vitals.getBp()>=80 && vitals.getBp()<=110){
                isBp= true;
            }
            if(vitals.getKilos()>=10 && vitals.getKilos()<=14){
                isKilos=true;
            } 
            
            if(vitals.getPound()>=22 && vitals.getPound()<=31){
                isPound=true;
            }
        }

        if(vitals.getAge()>3 && vitals.getAge()<=5){
            if (vitals.getResprt()>=20 && vitals.getResprt()<30){
                isResp= true;
            }
            if (vitals.getHeartrt()>=80 && vitals.getHeartrt()<=120){
                isHeart= true;
            }
            if (vitals.getBp()>=80 && vitals.getBp()<=110){
                isBp= true;
            }
            if(vitals.getKilos()>=14 && vitals.getKilos()<=18){
                isKilos=true;
            } 
            
            if(vitals.getPound()>=31 && vitals.getPound()<=40){
                isPound=true;
            }   
        }

        if(vitals.getAge()>=6 && vitals.getAge()<=12){
            if (vitals.getResprt()>=20 && vitals.getResprt()<30){
                isResp= true;
            }
            if (vitals.getHeartrt()>=70 && vitals.getHeartrt()<=110){
                isHeart= true;
            }
            if (vitals.getBp()>=80 && vitals.getBp()<=120){
                isBp= true;
            }
            if(vitals.getKilos()>=20 && vitals.getKilos()<=42){
                isKilos=true;
            } 
            
            if(vitals.getPound()>=41 && vitals.getPound()<=92){
                isPound=true;
            }
        }

        if(vitals.getAge()>=13){
            if (vitals.getResprt()>=12 && vitals.getResprt()<20){
                isResp= true;
            }
            if (vitals.getHeartrt()>=55 && vitals.getHeartrt()<=105){
                isHeart= true;
            }
            if (vitals.getBp()>=110 && vitals.getBp()<=120){
                isBp= true;
            }
            if(vitals.getKilos()>=50){
                isKilos=true;
            } 
            
            if(vitals.getPound()>=110){
                isPound=true;
            }
        }
     if(isResp==true && isHeart==true && isBp==true && isKilos==true &isPound==true){
        return true;
    }
    return false;
}
}