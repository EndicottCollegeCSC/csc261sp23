package edu.endicott.csc.shapefarmerv2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
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
    private ArrayList<Shape> shapes;
    private Timer timer;
    
    public Farm(int numberOfShapes, ArrayList<ShapeFactory> shapeFactories){
        Random random = new Random();
        this.addMouseListener((MouseListener) this);
        shapes = new ArrayList<>();

        for(int i = 0; i < numberOfShapes; i++){
            // call createShape on a random factory from shapeFactories.
            int randIndex = random.nextInt(shapeFactories.size());
            shapes.add(shapeFactories.get(randIndex).createShape());
        }
        // shapes.add(new Rectangle(10, 10, 20, 25));
        // shapes.add(new Circle(50, 60, 10));
        
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
        for(Shape shape : shapes){
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
        
        for(Shape shape : shapes){
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

    /**
     * Called by Swing Timer. Performs updates on shape characteristics.
     * 
     * @param e (Ignored)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Wandering all shapes.");
        for(Shape shape : shapes){
            shape.wander(0, getWidth(), 0, getHeight());
//            shape.wander(50, 200, 50, 200);

        }
        
        this.repaint();
    }

 
}
