package org.dstu.shapes.animation;

import org.dstu.shapes.Shape;
import org.dstu.shapes.Square;

import javax.swing.*;
import java.awt.*;

public class SquareAnimator extends Animator {

    public SquareAnimator(Shape shape, JComponent component) {
       super(shape, component);
    }

    @Override
    public void run() {
        while (true) {
            ((Square)shape).changeColor();
            if (component != null) {
                component.repaint();
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
