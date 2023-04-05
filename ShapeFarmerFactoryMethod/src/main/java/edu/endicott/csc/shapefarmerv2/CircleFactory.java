package edu.endicott.csc.shapefarmerv2;

public class CircleFactory extends ShapeFactory {

    @Override
    public Circle createShape() {
        // TODO Auto-generated method stub
        return new Circle(0, 0, 10);
    }

}
