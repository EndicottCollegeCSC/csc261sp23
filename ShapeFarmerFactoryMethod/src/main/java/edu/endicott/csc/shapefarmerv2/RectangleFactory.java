package edu.endicott.csc.shapefarmerv2;

public class RectangleFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        // TODO Auto-generated method stub
        return new Rectangle(0, 0, 10, 20);
    }
    
}
