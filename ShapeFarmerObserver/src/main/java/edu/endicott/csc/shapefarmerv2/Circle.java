package edu.endicott.csc.shapefarmerv2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

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
    
    /**
     * Draws the shape. If selected, the shape is highlighted with a border.
     * 
     * @param g The Graphics object to paint to. 
     */
    public void draw(Graphics g){
        if(isSelected){
            g.setColor(Color.red);
            g.fillOval(x-1, y-1, 2*radius+2, 2*radius+2);
        }
        
        g.setColor(Color.blue);
        g.fillOval(x, y, 2*radius, 2*radius);
    }
    
    /**
     * Checks if the given mouse click coordinates overlap this shape.
     * 
     * @param x The x position of the click.
     * @param y The y position of the click.
     * @return True if (x,y) lie inside of this shape.
     */
    public boolean wasClicked(int x, int y){
        return x >= this.x && x <= this.x+2*radius &&
               y >= this.y && y <= this.y+2*radius;
    }

    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("in Circle.mouseClicked()");
        if(wasClicked(e.getX(), e.getY())){
            select();
        } else {
            deselect();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("in Circle.mousePressed()");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("in Circle.mouseReleased()");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("in Circle.mouseEntered()");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("in Circle.mouseExited()");
    }

}
