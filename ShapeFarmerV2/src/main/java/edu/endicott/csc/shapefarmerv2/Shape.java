package edu.endicott.csc.shapefarmerv2;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public abstract class Shape implements Drawable, Selectable {
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
    
//    public abstract void wander();
}
