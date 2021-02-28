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
public class VitalSigns {
    private double age;

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    private double kilos;
    private double pound;
    private double heartrt;
    private double bp;
    private double resprt;
    private boolean isnormal;

    public boolean isIsnormal() {
        return isnormal;
    }

    public void setIsnormal(boolean isnormal) {
        this.isnormal = isnormal;
    }


    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getPound() {
        return pound;
    }

    public void setPound(double pound) {
        this.pound = pound;
    }

    public double getHeartrt() {
        return heartrt;
    }

    public void setHeartrt(double heartrt) {
        this.heartrt = heartrt;
    }

    public double getBp() {
        return bp;
    }

    public void setBp(double bp) {
        this.bp = bp;
    }

    public double getResprt() {
        return resprt;
    }

    public void setResprt(double resprt) {
        this.resprt = resprt;
    }
    
    
    
}
