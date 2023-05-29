package org.dstu.shapes.animation;

import org.dstu.shapes.Shape;
import org.dstu.shapes.Square1;

import javax.swing.*;

public class Square1Animator extends Animator {

    public Square1Animator(Shape shape, JComponent component) {
       super(shape, component);
    }

    @Override
    public void run() {
        while (true) {
            shape.moveRel((int) (Math.random()), (int) (Math.random() * 10));
            ((Square1)shape).changeColor();
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
