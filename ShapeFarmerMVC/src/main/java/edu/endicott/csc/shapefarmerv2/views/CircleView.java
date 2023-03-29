package edu.endicott.csc.shapefarmerv2.views;

public class CircleView extends ShapeView {
    Circle circle;
    CircleController controller;

    public ClircleView(Circle circle, CircleController controller){
        this.circle = circle;
        this.controller = controller;
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
}
