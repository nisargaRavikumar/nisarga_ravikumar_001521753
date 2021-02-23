/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author nisar
 */
public class MainClass {
    public static void main(String args[]){
      char option;
      char option1;
      char option2;
      PatientHistory patienthistory = new PatientHistory();
      do {
      VitalSigns vitalsigns = new VitalSigns();
      isPatientNormal check= new isPatientNormal();
      Scanner input = new Scanner(System.in);
      System.out.print("Press 0 to register a Patient's details \n Press 1 to view a saved pateint's Record");
      option = input.next().charAt(0);
      switch(option) {
          case '0' :
      System.out.println("Please enter patients name");
      String name = input.next();
      vitalsigns.setName(name);
      System.out.println("Please enter age");
      double age = input.nextDouble();
      vitalsigns.setAge(age);
      System.out.println("Please enter respiratory rate");
      int resprt = input.nextInt();
      vitalsigns.setResprt(resprt);
      System.out.println("Please enter heart rate");
      int heartrt = input.nextInt();
      vitalsigns.setHeartrt(heartrt);
      System.out.println("Please enter Blood pleasure");
      int bp = input.nextInt();
      vitalsigns.setBp(bp);
      System.out.println("Please enter weight in kilos");
      double kilos = input.nextDouble();
      vitalsigns.setKilos(kilos);
      System.out.println("Please enter weight in pound");
      double pound = input.nextDouble();
      vitalsigns.setPound(pound);
      boolean output=check.checkvital(vitalsigns);
      String saved;
      if(output==true){
          System.out.println("Patient is normal");
          vitalsigns.setIsnormal(true);
          saved = patienthistory.PatientHistory(vitalsigns);
      } else {
      System.out.println("Patient is abnormal");
      vitalsigns.setIsnormal(true);
          saved = patienthistory.PatientHistory(vitalsigns);
      }
      break;
          case '1' :
              System.out.print("Enter the patient's name");
              String Name1 = input.next();
              String match=patienthistory.History(Name1);
              if(match != "NA") {
              System.out.print("Enetr 0 if you want to check the individual vitals normality \n Enter 1 to exit");
              option1 = input.next().charAt(0);
              switch(option1) {
                  case '0' :
                      do {
                      System.out.print("Enter 1 for Respiratory \n Enter 2 for heart rate \n Enter 3 for Blood Pressure \n Enter 4 for weight in kilos \n enter 5 for weight pounds \n Enter 0 to exit");
                      option2 = input.next().charAt(0);
                      switch(option2){
                          case '1' :
                              patienthistory.isVitalNormal("R");
                              break;
                          case '2' :
                              patienthistory.isVitalNormal("H");
                              break;
                          case '3' :
                              patienthistory.isVitalNormal("B");
                              break;
                          case '4' :
                              patienthistory.isVitalNormal("WK");
                              break;
                          case '5' :
                              patienthistory.isVitalNormal("WP");
                              break;
                          case '0' :
                              return;    
                      }
              } while (option2 > 8);
                      break;
                  case '1' :
                      break;
              }
      }
              break;
          default : 
              System.out.print("Enter the correct option \n");
              break;
      }
      } while(option > 2);
    }
}
