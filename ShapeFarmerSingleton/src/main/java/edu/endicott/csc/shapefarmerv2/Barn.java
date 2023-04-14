package edu.endicott.csc.shapefarmerv2;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public class Barn implements Drawable, Selectable {
    private int x, y;  // Upper left corner.
    private boolean isSelected;
    private int width, height;
    
    public Barn(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
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
     * Draws the barn. If selected, the shape is highlighted with a border.
     * 
     * @param g The Graphics object to paint to. 
     */
    @Override
    public void draw(Graphics g){
        if(isSelected){
            g.setColor(Color.red);
            g.fillRect(x-1, y-1, width+2, height+2);
        }
        
        g.setColor(Color.orange);
        g.fillRect(x, y, width, height);
    }
    
    /**
     * Checks if the given mouse click coordinates overlap this barn.
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
    
}
