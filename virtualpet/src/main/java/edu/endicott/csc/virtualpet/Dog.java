package edu.endicott.csc.virtualpet;

/**
 *
 * @author hfeild
 */
public class Dog extends Pet {

    public Dog(){
        hunger = 0;
        sleepiness = 0;
        boredom = 0;
        happiness = 5;
    }
    
    @Override
    public void feed() {
        hunger -= 4;
        sleepiness += 2;
        boredom += 1;
    }

    @Override
    public void putToBed() {
        hunger += 1;        
        sleepiness = 1;
        boredom += 1;
    }

    @Override
    public void play() {
        boredom -= 4;
        sleepiness += 2;
        hunger += 3;
        
        if(hunger > 8 || sleepiness > 8 || boredom > 8){
            happiness -= 1;
        }
        if(hunger < 3 && sleepiness < 3 && boredom < 3){
            happiness += 1;
        }
    }

    @Override
    public void ignore() {
        hunger += 1;        
        sleepiness += 1;
        boredom += 2;
    }
    
}
