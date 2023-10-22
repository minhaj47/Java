package com.example.tetris;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Shape {
    // Game properties
    public static final int SHIFT = BlockGame.SHIFT;
    public static final int blockSIZE = BlockGame.blockSIZE;
    public static final int LENGTH = BlockGame.LENGTH;
    public static final int WIDTH = BlockGame.WIDTH;
    public static int xCRD = BlockGame.xCRD;
    public static int yCRD = BlockGame.yCRD;
    public int [][] map = BlockGame.map;

    Point [] points = new Point[4];
    Rectangle [] rectangles;
    int noRec = 4;
    Color color;
    int shapeId;

    public String getName() {
        return name;
    }

    private String name;

    //public int sp = 1;

    /*
    1 for L
    2 for I
    3 for S
    4 for O
    5 for T
    6 for Z
    7 for J
     */

    public Shape(Rectangle [] rectangles, int shapeId){
        this.rectangles = rectangles;

        switch(shapeId) {
            case 7:
                color = Color.LIGHTGRAY;
                points[0] = new Point(5,0);
                points[1] = new Point(5,1);
                points[2] = new Point(5,2);
                points[3] = new Point(4,2);
                break;
            case 2:
                color = Color.BLACK;
                points[0] = (new Point(5,0));
                points[1] = (new Point(5,1));
                points[2] = (new Point(5,2));
                points[3] = (new Point(5,3));
                break;
            case 5:
                color = Color.PINK;
                points[0] = (new Point(5,0));
                points[1] = (new Point(4,0));
                points[2] = (new Point(6,0));
                points[3] = (new Point(5,1));
                break;
            case 4:
                color = Color.GREEN;
                points[0] = (new Point(5,0));
                points[1] = (new Point(5,1));
                points[2] = (new Point(6,0));
                points[3] = (new Point(4,1));
                break;
            case 6:
                color = Color.RED;
                points[0] = (new Point(4,0));
                points[1] = (new Point(5,1));
                points[2] = (new Point(5,0));
                points[3] = (new Point(6,1));
                break;
            case 3:
                color = Color.BLUE;
                points[0] = (new Point(6,0));
                points[1] = (new Point(5,1));
                points[2] = (new Point(5,0));
                points[3] = (new Point(4,1));
                break;
            case 1:
                color = Color.GOLDENROD;
                points[0] = (new Point(5,0));
                points[1] = (new Point(5,1));
                points[2] = (new Point(5,2));
                points[3] = (new Point(6,2));
                break;
            default:
                System.out.println("default");
                color = Color.LIGHTGRAY;
                points[0] = (new Point(5,0));
                points[1] = (new Point(5,1));
                points[2] = (new Point(5,2));
                points[3] = (new Point(4,2));
        }
        for(int i=0; i<noRec; i++){
            rectangles[i].setFill(color);
            rectangles[i].setX(points[i].getX()*SHIFT);
            rectangles[i].setY(points[i].getY()*SHIFT);
        }
    }

    public void shiftRight(){
        for(int i=0; i<4; i++){
            points[i].updateX(1);
            rectangles[i].setX(rectangles[i].getX() + SHIFT);
        }
    }
    public void shiftLeft(){
        for(int i=0; i<4; i++){
            points[i].updateX(-1);
            rectangles[i].setX(rectangles[i].getX() - SHIFT);
        }
    }
    public void shiftDown(){
        for(int i=0; i<4; i++){
            points[i].updateY(1);
            rectangles[i].setY(rectangles[i].getY() + SHIFT);
        }
    }

    @Override
    public String toString(){
        for(int i=0; i<noRec; i++){
            System.out.println(points[i]);
            System.out.println(rectangles[i]);
        }
        System.out.println(color.getClass().getName());
        return null;
    }


}
