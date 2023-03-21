package edu.endicott.csc.shapefarmerv2;

/**
 *
 * @author hfeild
 */
public class PolymorphismFun {
    
    public static void makeWander(Wanderable wanderingObject){
        wanderingObject.wander(0, 1000, 0, 1000);
	// The following will compile and will work as long as 
	// wanderingObject is a Rectangle (or a subclass).
//        System.out.println("Is a square: "+ ((Rectangle) wanderingObject).isSquare());
	// The following will not compile -- Wanderables are not guaranteed to
	// have a method named isSquare().
//        System.out.println(wanderingObject.isSquare());
    }
    
    public static void main(String[] args){
        // Rectangle rectangle = new Rectangle(0, 10, 20, 50);
        // Barn barn = new Barn(10, 20, 100, 300);
        // Circle circle = new Circle(0, 35, 50);
        
        // Shape aShape;
        // Wanderable aWanderable = rectangle;
        // Selectable aSelectable;
        // Object anObject;
        // Barn aBarn;
        // Rectangle aRectangle;

        // System.out.println("("+rectangle.getX()+","+rectangle.getY()+")");
        // makeWander(rectangle);
        // System.out.println("("+rectangle.getX()+","+rectangle.getY()+")");
        // makeWander(aWanderable);
        // System.out.println("("+rectangle.getX()+","+rectangle.getY()+")");
        // makeWander((Wanderable) rectangle);
        // System.out.println("("+rectangle.getX()+","+rectangle.getY()+")");
        // makeWander(circle);
        // System.out.println("("+circle.getX()+","+circle.getY()+")");
        
    }
}
