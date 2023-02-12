package edu.endicott.csc.shapefarmerv1;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * Responsible for displaying the player's farm, including the shapes the
 * player owns.
 * 
 * @author hfeild
 */
public class Farm extends JPanel implements MouseListener {
    private ArrayList<Rectangle> shapes;
    
    public Farm(){
        this.addMouseListener((MouseListener) this);
        shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 10, 20, 25));
    }
    
    /**
     * Draws all of the shapes that live on the farm.
     * 
     * @param g The Graphics component to paint to.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        // Draw our shapes.
        for(Rectangle shape : shapes){
            shape.draw(g);
        }
    }
    
    /**
     * Selects all shapes whose presence on the farm lies where a click occurs.
     * All other shapes are deselected.
     * 
     * @param e The mouse event associated with the click.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click at "+ e.toString());
        
        for(Rectangle shape : shapes){
            if(shape.wasClicked(e.getX(), e.getY())){
                shape.select();
            } else {
                shape.deselect();
            }
        }
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Press at "+ e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Release at "+ e.toString());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered at "+ e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited at "+ e.toString());
    }

 
}
