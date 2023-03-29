package edu.endicott.csc.shapefarmerv2.models;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Models a rectangle shape.
 * 
 * @author hfeild
 */
public class Circle extends Shape {
//    private int x, y;  // Upper left corner.
      private int radius;
//    private boolean isSelected;
    
    /**
     * Creates a new Rectangle.
     * 
     * @param x The x position of the upper left corner.
     * @param y The y position of the upper left corner.
     * @param width The rectangle's width.
     * @param height  The rectangle's height.
     */
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        isSelected = false;
    }

}
