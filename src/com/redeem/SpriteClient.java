package com.redeem;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class SpriteClient extends Application {

    private Sprite s1, s2, s3;

    @Override
    public void start(Stage stage) {
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Sprites", 200, 370);

        new Sprite(10, 31).draw(gc, "Jan");
        new Sprite(40, 29).draw(gc, "Feb");
        new Sprite(70, 43).draw(gc, "Mar");
        new Sprite(100, 64).draw(gc, "Apr");
        new Sprite(130, 69).draw(gc, "May");
        new Sprite(160, 81).draw(gc, "Jun");
        new Sprite(190, 87).draw(gc, "Jly");
        new Sprite(220, 86).draw(gc, "Aug");
        new Sprite(250, 75).draw(gc, "Sep");
        new Sprite(280, 62).draw(gc, "Oct");
        new Sprite(310, 44).draw(gc, "Nov");
        new Sprite(340, 26).draw(gc, "Dec");


        /* s1 = new Sprite(100, 50, .5);
        s2 = new Sprite(225, 100, 1);
        s3 = new Sprite(100, 300, 1.5);

        s1.draw(gc);
        s2.draw(gc);
        s3.draw(gc); */
    }

    public static void main(String[] args) {
        launch(args);
    }
}
