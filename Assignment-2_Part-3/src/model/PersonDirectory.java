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
public class PersonDirectory {
    public Person person;
    public ArrayList<Person> personlist;
    
    public PersonDirectory(){
        this.personlist= new ArrayList<Person>();
    }
    
    public String addPerson(Person person){
        this.person = person;
        this.personlist.add(person);
        
        return "Person added to directory successfully";
    }
    
    public Person getPerson(int id){
        Person person = null;
        for(Person p: this.personlist){
            if(p.getUniqueID()==id){
                person = p;
            }
        
        }
        return person;
    }
}
