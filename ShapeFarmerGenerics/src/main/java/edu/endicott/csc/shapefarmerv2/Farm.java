package edu.endicott.csc.shapefarmerv2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.Timer;



/**
 * Responsible for displaying the player's farm, including the shapes the
 * player owns.
 * 
 * @author hfeild
 */
public class Farm extends JPanel implements MouseListener, ActionListener {
    private final int TIME_SPEEDUP = 3600; // 1 second in real life = 1 hour (60*60) seconds in the game.
    private final int UPDATE_INTERVAL_MS_GAME = 1000*60*30; // Every 1/2 hours.
    private final int UPDATE_INTERVAL_MS_REAL = (int) (UPDATE_INTERVAL_MS_GAME / TIME_SPEEDUP);
    // private ArrayList<Shape> shapes;
    private ArrayList<Pen> pens;
    private Pen rectanglePen, circlePen;
    private Timer timer;
    
    public Farm(){
        this.addMouseListener((MouseListener) this);
        // shapes = new ArrayList<>();
        pens = new ArrayList<>();
        rectanglePen = new Pen(10, 10, 100, 100);
        circlePen = new Pen(10, 150, 150, 100);
        pens.add(rectanglePen);
        pens.add(circlePen);

        // This would be better implemented via a Factory Method class that we pass to the pen and as the pen to 
        // call the factor n times. 
        rectanglePen.add(new Rectangle(15, 15, 20, 25));
        rectanglePen.add(new Rectangle(20, 20, 10, 15));
        rectanglePen.add(new Rectangle(30, 15, 15, 15));
        rectanglePen.add(new Circle(30, 15, 25));
        circlePen.add(new Circle(75, 155, 10));
        circlePen.add(new Circle(75, 155, 15));
        
        timer = new Timer(UPDATE_INTERVAL_MS_REAL, this);
        timer.start();
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
        for(Pen pen : pens){
            pen.draw(g);
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
        
        for(Pen pen : pens){
            pen.mouseClicked(e);
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

    /**
     * Called by Swing Timer. Performs updates on shape characteristics.
     * 
     * @param e (Ignored)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Wandering all shapes.");
        for(Pen pen : pens){
            pen.wander();
        }

        this.repaint();
    }

 
}
