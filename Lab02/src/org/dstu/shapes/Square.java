package org.dstu.shapes;

import org.dstu.shapes.animation.Animator;
import org.dstu.shapes.animation.SquareAnimator;

import javax.swing.*;
import java.awt.*;

public class Square extends Shape {
    protected int side1;
    protected int side2;

    public Square() {
    }

    public Square(int x, int y, int side1, int side2, Color color) {
        super(x, y, color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide1(int side) {
        this.side1 = side1;
    }

    public void setSide2(int side) {
        this.side2 = side2;
    }

    public void changeColor() {
        color = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, side1, side2);
        g.fillRect(x, y, side1, side2);
    }

    @Override
    public Animator getAnimator(JComponent component) {
        return new SquareAnimator(this, component);
    }
}
