package edu.endicott.csc.shapefarmerv1;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public class Rectangle {
    private int x, y,  // Upper left corner.
            width, height;
    private boolean isSelected;
    
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
    public boolean wasClicked(int x, int y){
        return x >= this.x && x <= this.x+width &&
               y >= this.y && y <= this.y+height;
    }
    
    /**
     * @return Whether the shape is selected.
     */
    public boolean isSelected(){
        return isSelected;
    }
    
    /**
     * Selects the shape. This will cause it to be highlighted when drawn next.
     */
    public void select(){
        isSelected = true;
    }
    
    /**
     * Deselects the shape.
     */
    public void deselect(){
        isSelected = false;
    }
}
