package com.example.tetris;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.Duration;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import java.util.concurrent.atomic.AtomicBoolean;


public class BlockGame extends Application {
    // Game Properties
    public static final int LENGTH = 20;
    public static final int WIDTH = 12;
    public static final int SHIFT = 25;
    public static final int blockSIZE = 23;
    public static int xCRD = SHIFT*WIDTH;
    public static int yCRD = SHIFT*LENGTH;

    private static Pane pane = new Pane();
    private static Scene scene = new Scene(pane, xCRD+150, yCRD);
    public static int [][] map = new int[LENGTH][WIDTH];
    //private static Shape shape = new Shape();

    private static int score =0;
    private static boolean gState  =true;
    private static int lineState = 0;

    // start

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //initializing map
        for(int [] a: map){
            Arrays.fill(a, 0);
        }

        // making UI
        Line line = new Line(xCRD, 0, xCRD,yCRD);
        Text score = new Text();
        score.setText("SCORE : ");
        score.setFont(new Font("Glass Antiqua", 20));
        score.setX(xCRD + 5);
        score.setY(50);
        pane.getChildren().addAll(line, score);


        // Creation of Shape
        GameManager gm = new GameManager();
        //motionWorks(gm, Duration.ofMillis(400));
        timerTask(gm);

        // Stage properties

        //scene.getStylesheets().add("application.css");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("T E T R I S");
        Image icon = new Image("tetris.png");
        stage.getIcons().add(icon);
        keyPressListener(gm);
        stage.show();
    }

    private void keyPressListener(GameManager gm){
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()){
                case DOWN -> gm.moveDown();
                case RIGHT -> gm.moveRight();
                case LEFT -> gm.moveLeft();
            }
        });
    }

    private void timerTask(GameManager gm) {

        gm.makeShape();
        for (int i = 0; i < 4; i++) {
            pane.getChildren().add(gm.shape.rectangles[i]);
        }
        giveMotion(gm, Duration.ofMillis(600));

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //System.out.println("Task executed");

                Platform.runLater(() -> {

                    if (!gm.isBottom()) {    // returns whether bottom is free or not

                        for (int i = 0; i < 4; i++) {
                            map[gm.shape.points[i].getY()][gm.shape.points[i].getX()]=1;
                        }

                        gm.makeShape();
                        for (int i = 0; i < 4; i++) {
                            pane.getChildren().add(gm.shape.rectangles[i]);
                        }
                        giveMotion(gm, Duration.ofMillis(600));
                    }
                });
            }
        };

        timer.scheduleAtFixedRate(task, 0, 600);
    }

    public void giveMotion(GameManager gm, Duration interval) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private long previousTime = 0;

            @Override
            public void handle(long now) {
                if (previousTime == 0) {
                    previousTime = now;
                    return;
                }

                long elapsedTime = now - previousTime;
                if (elapsedTime >= interval.toNanos()) {
                    previousTime = now;

                    Platform.runLater(() -> {
                        gm.moveDown();

                        if (!gm.isBottom()) {
                            stop();
                        }
                    });
                }
            }
        };

        animationTimer.start();
    }

}

