package edu.endicott.csc.shapefarmerv2;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public abstract class Shape implements Drawable, Selectable, Wanderable, Comparable<Shape> {
    protected int x, y;  // Upper left corner.
    protected boolean isSelected;
    
    /**
     * @return Whether the shape is selected.
     */
    @Override
    public boolean isSelected(){
        return isSelected;
    }
    
    /**
     * Selects the shape. This will cause it to be highlighted when drawn next.
     */
    @Override
    public void select(){
        isSelected = true;
    }
    
    /**
     * Deselects the shape.
     */
    @Override
    public void deselect(){
        isSelected = false;
    }
    
    /**
     * Moves the shape in a random direction.
     */
    @Override
    public void wander(int minX, int maxX, int minY, int maxY){
        // TODO -- make it so that x can't be less than 0 or more than
        //         than the Farm panel width.
        //         y can't be less than 0 or more than the Farm panel height.
        
        x =  Math.max(Math.min(x + (int) (Math.random()*50-25), maxX), minX);
        y =  Math.max(Math.min(y + (int) (Math.random()*50-25), maxY), minY);
        
        //y += (int) (Math.random()*10-5);
    }
    
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
