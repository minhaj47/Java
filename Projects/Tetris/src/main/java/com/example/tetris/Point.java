package com.example.tetris;

public class Point {
    private int x, y;
    int shapeType =1;

    public int getShapeType() {
        return shapeType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void updateX(int increment){
        x+=increment;
    }

    public void updateY(int increment){
        y+=increment;
    }


    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y, int shapeType){
        this.x = x;
        this.y = y;
        this.shapeType = shapeType;
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point X: " + x + " Y: " + y;
    }
}
