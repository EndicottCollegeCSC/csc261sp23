package edu.endicott.csc.shapefarmerv2.controllers;


public class CircleController extends ShapeController {
    Circle circle;
    CircleView view;
    public CircleController(Circle circle, CircleView View){
        this.circle = circle;
        this.view = view;
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
}
