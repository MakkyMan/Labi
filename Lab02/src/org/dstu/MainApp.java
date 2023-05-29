package org.dstu;

import org.dstu.components.GraphicsPanel;
import org.dstu.shapes.Shape;
import org.dstu.shapes.Square;
import org.dstu.shapes.Square1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(50, 700, 700, 50, Color.BLUE));
        shapes.add(new Square1(50, 150, 50, 50, Color.BLUE));
        shapes.add(new Square1(350, 150, 50, 50, Color.BLUE));


        GraphicsPanel canvas = new GraphicsPanel(shapes);


        for (Shape s: shapes) {
            Thread t = new Thread(s.getAnimator(canvas));
            t.start();
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(canvas);
        frame.setVisible(true);

//        Thread animationThread = new Thread(circleController);
//        animationThread.start();
    }
}
