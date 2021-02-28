/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author nisar
 */
public class MainClass {
    public static void main(String args[]){
        char option;
      PersonDirectory personDirectory = new PersonDirectory();
      isPatientNormal IsNormal = new isPatientNormal();
      Person p1 = new Person();
      p1.setName("Nis");
      p1.setAge(20);
      p1.setUniqueID(0);
      
      personDirectory.addPerson(p1);
      
      Person p2 = new Person();
      p2.setName("Anvi");
      p2.setAge(4);
      p2.setUniqueID(1);
      
      personDirectory.addPerson(p2);
      
      Person p3 = new Person();
      p3.setName("Sam");
      p3.setAge(1);
      p3.setUniqueID(2);
      
      personDirectory.addPerson(p3);
      
      Person p4 = new Person();
      p4.setName("Sam");
      p4.setAge(.5);
      p4.setUniqueID(3);
      
      personDirectory.addPerson(p4);
      
      Person p5 = new Person();
      p5.setName("Pam");
      p5.setAge(0);
      p5.setUniqueID(4);
      
      personDirectory.addPerson(p5);
      
      Person p6 = new Person();
      p6.setName("Lavie");
      p6.setAge(20);
      p6.setUniqueID(5);
      
      personDirectory.addPerson(p6);
      
      Person p7 = new Person();
      p7.setName("Stephen");
      p7.setAge(4);
      p7.setUniqueID(6);
      
      personDirectory.addPerson(p7);
      
      Person p8 = new Person();
      p8.setName("Jack");
      p8.setAge(1);
      p8.setUniqueID(7);
      
      personDirectory.addPerson(p8);
      
      Person p9 = new Person();
      p9.setName("Jim");
      p9.setAge(.5);
      p9.setUniqueID(8);
      
      personDirectory.addPerson(p9);
      
      Person p10 = new Person();
      p10.setName("Dhruv");
      p10.setAge(0);
      p10.setUniqueID(9);
      
      personDirectory.addPerson(p10);
      
      
      System.out.println();
      
      House h1 = new House();
      h1.setHousename("Orchards");
      
      House h2 = new House();
      h2.setHousename("Banglow");
      
      House h3 = new House();
      h3.setHousename("Sapiens");
      
      House h4 = new House();
      h4.setHousename("Tremonts");
      
      House h5 = new House();
      h5.setHousename("Berrys");
      
      h1.addPerson(p1);
      h2.addPerson(p2);
      h3.addPerson(p3);
      h4.addPerson(p4);
      h5.addPerson(p5);
      h1.addPerson(p6);
      h2.addPerson(p7);
      h3.addPerson(p8);
      h4.addPerson(p9);
      h5.addPerson(p10);
      
      Community c1 = new Community();
      c1.setComunityname("Longwood");
      
      Community c2 = new Community();
      c2.setComunityname("Southend");
      
      c1.addHouses(h1);
      c2.addHouses(h2);
      c2.addHouses(h3);
      c1.addHouses(h4);
      c1.addHouses(h5);
      
      City city = new City();
      city.setCityname("Boston");
      city.addCommunities(c2);
      city.addCommunities(c1);
      PatientDirectory PaDr = new PatientDirectory();
      
      while(true) {
          System.out.println("Choose options\n 1. Add a patient \n 2. view a record \n 3. View abnormal blood pressure in the city \n 4. Exit");
          Scanner input = new Scanner(System.in);
          int select = input.nextInt();
      switch (select) {
          case 1 :
              VitalSigns VS = new VitalSigns();
              System.out.println("Type the patient's Unique ID");
              int uid = input.nextInt();
              Patient PPresent = PaDr.getPatient(uid);
              if(PPresent == null) {
                  Person PerPresent = personDirectory.getPerson(uid);
                  if(PerPresent == null) {
                      System.out.println("No person exists");
                      break;
                  } else {
                      Patient Patient_1 = new Patient(PerPresent);
                      PaDr.addPattient(Patient_1);
                      PPresent = Patient_1;
                  }
              }

              LocalDateTime time = LocalDateTime.now();
              boolean flag = true;
              boolean flag2 = true;
              boolean flag3 = true;
              boolean flag4 = true;
              boolean flag5 = true;
              boolean flag6 = true;
              double age = 0;
              int resprt = 0;
              int heartrt = 0;
              int bp = 0;
              double kilos = 0;
              double pound = 0;
              System.out.println("Verify thr age of the patient");
              while(flag) {
                  try {
                      age = Double.parseDouble(input.next());
                      flag = false;
                  } catch(Exception e) {
                      System.out.println("Enter details correctly");
                      System.out.println("Verify thr age of the patient");
                      flag = true;
                  }
              }
              VS.setAge(age);
      System.out.println("Please enter respiratory rate");
      while(flag2) {
                  try {
                      resprt = Integer.parseInt(input.next());
                      flag2 = false;
                  } catch(Exception e) {
                      System.out.println("Enter details correctly");
                      System.out.println("Please enter respiratory rate");
                      flag2 = true;
                  }
              }
      VS.setResprt(resprt);
      System.out.println("Please enter heart rate");
      while(flag3) {
                  try {
                      heartrt = Integer.parseInt(input.next());
                      flag3 = false;
                  } catch(Exception e) {
                      System.out.println("Enter details correctly");
                      System.out.println("Please enter heart rate");
                      flag3 = true;
                  }
              }
      VS.setHeartrt(heartrt);
      System.out.println("Please enter Blood pleasure");
      while(flag4) {
                  try {
                      bp = Integer.parseInt(input.next());
                      flag4 = false;
                  } catch(Exception e) {
                      System.out.println("Enter details correctly");
                      System.out.println("Please enter Blood pleasure");
                      flag4 = true;
                  }
              }
      
      VS.setBp(bp);
      System.out.println("Please enter weight in kilos");
      while(flag5) {
                  try {
                      kilos = Double.parseDouble(input.next());
                      flag5 = false;
                  } catch(Exception e) {
                      System.out.println("Enter details correctly");
                      System.out.println("Verify thr age of the patient");
                      flag5 = true;
                  }
              }
      VS.setKilos(kilos);
      System.out.println("Please enter weight in pound");
      while(flag6) {
                  try {
                      pound = Double.parseDouble(input.next());
                      flag6 = false;
                  } catch(Exception e) {
                      System.out.println("Enter details correctly");
                      System.out.println("Please enter weight in pound");
                      flag6 = true;
                  }
              }
      VS.setPound(pound);
      boolean IsNormalCheck = IsNormal.checkvital(VS);
      VS.setIsnormal(IsNormalCheck);
      Encounter encounter = new Encounter();
      encounter.setPatientvitalslist(VS);
      encounter.setTime(time);
      PPresent.enhistory.addEcounter(encounter);
      System.out.print("Enter 1 for Respiratory \n Enter 2 for heart rate \n Enter 3 for Blood Pressure \n Enter 4 for weight in kilos \n enter 5 for weight pounds \n Enter 0 to exit");
      option = input.next().charAt(0);
      String ShowOutput;
      switch(option) {
          case '1' :
                              ShowOutput = PPresent.isVitalNormal("R");
                              System.out.println(ShowOutput);
                              break;
                          case '2' :
                              ShowOutput = PPresent.isVitalNormal("H");
                              System.out.println(ShowOutput);
                              break;
                          case '3' :
                              ShowOutput = PPresent.isVitalNormal("B");
                              System.out.println(ShowOutput);
                              break;
                          case '4' :
                              ShowOutput = PPresent.isVitalNormal("WK");
                              System.out.println(ShowOutput);
                              break;
                          case '5' :
                              ShowOutput = PPresent.isVitalNormal("WP");
                              System.out.println(ShowOutput);
                              break;
      }
      break;
          case 2 :
              System.out.println("------------------patient details-------------------");
              for(Patient patient : PaDr.getPatientlist()) {
                  System.out.println("Patient's Name "+ patient.getName());
                  System.out.println("Patient ID:" +patient.getUniqueID());
                  
                  System.out.println("Encounter history :");
                  for(Encounter Encounter : patient.getEnhistory().getEnHistory()) {
                      System.out.println("The Timestamp is:" +Encounter.getTime());
                      VitalSigns Vitals_1 = Encounter.getPatientvitalslist();
                      System.out.println("RespiratoryRate:" + Vitals_1.getResprt() + "\nHeartRate: "+ Vitals_1.getHeartrt()+ "\nBlood pressure: "+ Vitals_1.getBp() +"\nWeight in Kilos: "+ Vitals_1.getKilos());
                  }
              }
              break;
              
          case 3 :
                                  
                                    
                               for(Community Comm : city.getCommunities()){
                                   int counter = 0;
                                   System.out.println("The persons with blood pressure abnormal in community "+Comm.getComunityname());
                                    for(House H : Comm.getHouselist()){
                                        for(Person P : H.getPersons()){
                                            String Check;
                                            //double age_check = P.getAge();
                                            Patient patientexists = PaDr.getPatient(P.getUniqueID());
                                            if(patientexists != null){
                                                Encounter Enc = patientexists.enhistory.getEnHistory().get(patientexists.enhistory.getEnHistory().size()-1);
                                                Check = patientexists.isVitalNormal("B");
                                                if(Check.equals("AbNormal")) {
                                                    counter++;
                                                }      
                                            }
                                        }
                                    }
                                   System.out.println(counter);
                                }
                                break;
          case 4:
              return;
              
      }
      }
      
      
      
}
}