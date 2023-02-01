package edu.endicott.csc.virtualpet;

/**
 *
 * @author hfeild
 */
public class Dog extends Pet {

    @Override
    public void feed() {
        hunger -= 4;
//        sleepinessBar.setValue(sleepinessBar.getValue()+2);
//        boredomBar.setValue(boredomBar.getValue()+1);
    }

    @Override
    public void putToBed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ignore() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
