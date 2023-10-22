package com.example.tetris;

import javafx.scene.shape.Rectangle;

public class GameManager {
    public static final int SHIFT = BlockGame.SHIFT;
    public static final int blockSIZE = BlockGame.blockSIZE;
    public static final int LENGTH = BlockGame.LENGTH;
    public static final int WIDTH = BlockGame.WIDTH;
    public static int xCRD = BlockGame.xCRD;
    public static int yCRD = BlockGame.yCRD;
    public int [][] map = BlockGame.map;

    Shape shape;

    public Shape makeShape(){
        int shapeId = (int) (Math.random() *8);
        System.out.println(shapeId);

        Rectangle [] rectangles = {
                new Rectangle(blockSIZE, blockSIZE),
                new Rectangle(blockSIZE, blockSIZE),
                new Rectangle(blockSIZE, blockSIZE),
                new Rectangle(blockSIZE, blockSIZE)
        } ;

        shape = new Shape(rectangles, shapeId);

        return shape;
    }
    public boolean isRight(){

        for(int i=0; i<4; i++){
            if(shape.points[i].getX() + 1 >= WIDTH || map[shape.points[i].getY()][shape.points[i].getX() + 1] != 0)
                return false;
        }
        return true;
    }
    public boolean isLeft(){
        for(int i=0; i<4; i++){
            if(shape.points[i].getX() - 1 < 0 || map[shape.points[i].getY()][shape.points[i].getX() - 1] != 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isBottom(){
        for(int i=0; i<4; i++){
            if(shape.points[i].getY() + 1 >= LENGTH || map[shape.points[i].getY() + 1][shape.points[i].getX()] != 0)
                return false;
        }
        return true;
    }
    public void moveRight(){
        if(isRight()){
            shape.shiftRight();
        }
    }
    public void moveLeft(){
        if(isLeft()){
            shape.shiftLeft();
        }
    }
    public void moveDown(){
        if(isBottom()){
            shape.shiftDown();
        }
    }

//    public boolean reachedBottom() {
//
//    }
}
