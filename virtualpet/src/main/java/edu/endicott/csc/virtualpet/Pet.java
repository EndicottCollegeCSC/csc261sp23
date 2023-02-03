/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.endicott.csc.virtualpet;

/**
 *
 * @author hfeild
 */
public abstract class Pet {

       
    protected int boredom, sleepiness, hunger, happiness;
    protected String name;
    
    public abstract void feed();
    public abstract void putToBed();
    public abstract void play();
    public abstract void ignore();
    
    
    public int getBoredom() {
        return boredom;
    }

    public int getSleepiness() {
        return sleepiness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
