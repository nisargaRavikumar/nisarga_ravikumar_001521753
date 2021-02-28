/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author nisar
 */
public class Encounter {
    private String name;
    public VitalSigns patientvitalslist;
    public LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VitalSigns getPatientvitalslist() {
        return patientvitalslist;
    }

    public void setPatientvitalslist(VitalSigns patientvitalslist) {
        this.patientvitalslist = patientvitalslist;
    }
    
    
    
    
}
