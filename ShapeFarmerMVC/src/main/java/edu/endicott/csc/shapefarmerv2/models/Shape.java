package edu.endicott.csc.shapefarmerv2.models;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public abstract class Shape implements Comparable<Shape> {
    protected int x, y;  // Upper left corner.
    protected boolean isSelected;
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    @Override
    public String toString(){
        return this.getClass()+"("+ x +","+ y +")";
    }

    @Override
    public int compareTo(Shape o) {
        if(this.x > o.x){
            return 1;
        } else if(this.x < o.x){
            return -1;
        } else {
            if(this.y > o.y){
                return 1;
            } else if(this.y < o.y) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    
}
