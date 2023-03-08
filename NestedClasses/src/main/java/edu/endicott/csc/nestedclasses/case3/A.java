/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.endicott.csc.nestedclasses.case3;

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
    
    
    public class C {
        public int a = 20;
        protected int b = 21;
        int c = 22;
        private int d = 23;

        @Override
        public String toString(){
            return "a: "+ a +", b: "+ b + ", c: "+ c +", d: "+ d +    
                "\nA.this.a: "+ A.this.a +
                ", A.this.b: "+ A.this.b + 
                ", A.this.c: "+ A.this.c +
                // CAN do this:
                 ", A.this.d: "+ A.this.d;
        }
    }
    
    public Interface1 anInterface = new Interface1() {
        public int a = 10;
        protected int b = 11;
        int c = 12;
        private int d = 13;
    
        @Override
        public void interfaceMethod1() {
                   System.out.println("Hello from A.anInterface.interfaceMethod1!");
        }
        
            @Override
        public String toString(){
            return "a: "+ a +", b: "+ b + ", c: "+ c +", d: "+ d;
        }
    };
}
