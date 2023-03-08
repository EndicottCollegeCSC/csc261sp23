/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.endicott.csc.nestedclasses.case1;

import edu.endicott.csc.nestedclasses.Interface1;

/**
 *
 * @author hfeild
 */
public class A {
    public int a = 0;
    protected int b = 1;
    int c = 2;
    private int d = 3;
    
    @Override
    public String toString(){
        return "a: "+ a +", b: "+ b + ", c: "+ c +", d: "+ d;
    }
}

class B implements Interface1 {
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

class C extends A{
    public int a = 20;
    protected int b = 21;
    int c = 22;
    private int d = 23;
    
    @Override
    public String toString(){
        return "a: "+ a +", b: "+ b + ", c: "+ c +", d: "+ d +    
            "\nsuper.a: "+ super.a +
            ", super.b: "+ super.b + 
            ", super.c: "+ super.c; 
            // Can't do this:
            // ", super.d: "+ super.d;
    }
}

