package edu.endicott.csc.shapefarmerv2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class Pen {
    private ArrayList<Shape> shapes;
    private int x, y, width, height;

    /**
     * Creates a new rectangular pen with the given dimensions.
     * 
     * @param x The upper left corner x-coordinate.
     * @param y THe upper left corner y-coordinate.
     * @param width The width of the pen.
     * @param height The height of the pen.
     */
    public Pen(int x, int y, int width, int height){
        shapes = new ArrayList<>();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Adds the given shape to the pen.
     * 
     * @param shape The shape to add.
     */
    public void add(Shape shape){
        shapes.add(shape);
    }

    /**
     * @return The iterator over the pen's shapes.
     */
    public Iterator<Shape> getShapes(){
        return shapes.iterator();
    }

    /**
     * Draws each of the shapes in the pen.
     * 
     * @param g The graphics object to paint to.
     */
    public void draw(Graphics g){
        // Draw the pen.
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);

        // Draw the shapes in the pen.
        for(Shape shape : shapes){
            shape.draw(g);
        }
    }

    /**
     * Selects or deselects shapes based on whether they were clicked.
     * 
     * @param e The MouseEvent associated with the click.
     */
    public void mouseClicked(MouseEvent e){
        for(Shape shape : shapes){
            if(shape.wasClicked(e.getX(), e.getY())){
                shape.select();
            } else {
                shape.deselect();
            }
        }
    }

    /**
     * Causes each shape to take a step in a random direction within the confines of the pen.
     */
    public void wander(){
        for(Shape shape : shapes){
            shape.wander(x, x+width, y, y+height);
        }
    }
}
