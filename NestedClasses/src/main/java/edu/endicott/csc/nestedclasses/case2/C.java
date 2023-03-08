/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.endicott.csc.nestedclasses.case2;

/**
 *
 * @author hfeild
 */
public class C extends A {
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
