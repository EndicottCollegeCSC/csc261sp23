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
public class Case3Runner {
    public static void main(String[] args){
        A myA = new A();
        Interface1 myB = myA.anInterface;
        A.C myC = myA.new C();
        // Declare an instance of StaticC named myStaticC.
        A.StaticC myStaticC = new A.StaticC();
        
        System.out.println("myA: "+ myA);
        System.out.println("myA.B: "+ myB);
        System.out.println("myC: "+ myC);
        System.out.println("myStaticC: "+ myStaticC);

        
//        A myA = new A();
//        B myB = new B();
//        C myC = new C();
//        
//        System.out.println("myA: "+ myA);
//        System.out.println("myB: "+ myB);
//        System.out.println("myC: "+ myC);
        
    }
}
