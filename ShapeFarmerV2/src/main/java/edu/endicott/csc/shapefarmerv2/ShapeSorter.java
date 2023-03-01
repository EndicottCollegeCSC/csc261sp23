package edu.endicott.csc.shapefarmerv2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hfeild
 */
public class ShapeSorter {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, 10, 2));
        shapes.add(new Rectangle(0, 0, 10, 3));
        shapes.add(new Rectangle(50, 3, 5, 6));
        shapes.add(new Circle(50, 2, 15));

        System.out.println(shapes);

        Collections.sort(shapes);
        
        System.out.println(shapes);

    }
}
