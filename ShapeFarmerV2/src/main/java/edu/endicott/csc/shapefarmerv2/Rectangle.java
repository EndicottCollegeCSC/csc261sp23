package edu.endicott.csc.shapefarmerv2;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public class Rectangle extends Shape {
//    private int x, y;  // Upper left corner.
    private int width, height;
//    private boolean isSelected;

    /**
     * Creates a new Rectangle.
     * 
     * @param x The x position of the upper left corner.
     * @param y The y position of the upper left corner.
     * @param width The rectangle's width.
     * @param height  The rectangle's height.
     */
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        isSelected = false;
    }
    
    /**
     * Draws the shape. If selected, the shape is highlighted with a border.
     * 
     * @param g The Graphics object to paint to. 
     */
    @Override
    public void draw(Graphics g){
        if(isSelected){
            g.setColor(Color.red);
            g.fillRect(x-1, y-1, width+2, height+2);
        }
        
        g.setColor(Color.blue);
        g.fillRect(x, y, width, height);
    }
    
    /**
     * Checks if the given mouse click coordinates overlap this shape.
     * 
     * @param x The x position of the click.
     * @param y The y position of the click.
     * @return True if (x,y) lie inside of this shape.
     */
    @Override
    public boolean wasClicked(int x, int y){
        return x >= this.x && x <= this.x+width &&
               y >= this.y && y <= this.y+height;
    }
    
//    public void wander(){
//        System.out.println("In Rectangle.wander()");
//    }
    
    /**
     * Determines whether this rectangle is a square.
     * 
     * @return True if this rectangle's width and height are the same.
     */
    public boolean isSquare(){
        return width == height;
    }
}
