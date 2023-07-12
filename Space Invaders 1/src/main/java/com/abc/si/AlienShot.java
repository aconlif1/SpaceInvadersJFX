package com.abc.si;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class AlienShot extends Rectangle {
    public static final double WIDTH = 5;
    public static final double HEIGHT = 10;
    private static final Color COLOR = Color.RED;
    private static final double SPEED = 5.0;

    public AlienShot(double x, double y) {
        super(x, y, WIDTH, HEIGHT);
        setFill(COLOR);
    }

    public void update() {
        setY(getY() + SPEED);
    }
}
