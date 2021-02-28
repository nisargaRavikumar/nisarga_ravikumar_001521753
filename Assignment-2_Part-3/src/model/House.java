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
public class House {
    public String Housename;
    public Person person;
    public ArrayList<Person> persons;
    
    public House(){
        this.persons= new ArrayList<Person>();
        
    }
    
    public void addPerson(Person person){
        this.person= person;
        this.persons.add(person);
    }

    public String getHousename() {
        return Housename;
    }

    public void setHousename(String Housename) {
        this.Housename = Housename;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
}
