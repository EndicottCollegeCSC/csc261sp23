/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.endicott.csc.nestedclasses.case2;

import edu.endicott.csc.nestedclasses.Interface1;

public class B implements Interface1 {
    public int a = 10;
    protected int b = 11;
    int c = 12;
    private int d = 13;
    
    @Override
    public void interfaceMethod1() {
       System.out.println("Hello from B.interfaceMethod1!");
    }
    
    @Override
    public String toString(){
        return "a: "+ a +", b: "+ b + ", c: "+ c +", d: "+ d;
    }
}