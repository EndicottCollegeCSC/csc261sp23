package edu.endicott.csc.shapefarmerv2;

public class RectangleBuilder {
    private int width = 0, height = 0, x = 0, y=0;

    public RectangleBuilder x(int x){
        this.x = x;
        return this;
    } 

    public RectangleBuilder y(int y){
        this.y = y;
        return this;
    } 

    public RectangleBuilder width(int width){
        this.width = width;
        return this;
    } 

    public RectangleBuilder height(int height){
        this.height = height;
        return this;
    } 

    public Rectangle build(){
        if(height == 0){
            height = width;
        }
        return new Rectangle(x, y, width, height);
    }
}
