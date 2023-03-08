package edu.endicott.csc.nestedclasses.case2;

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
