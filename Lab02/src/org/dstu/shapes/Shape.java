package org.dstu.shapes;

import com.sun.source.tree.IfTree;
import org.dstu.shapes.animation.Animator;

import javax.swing.*;
import java.awt.*;

public abstract class Shape {
    protected int x;
    protected int y;
    protected Color color;

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int n=1;
    public void moveRel(int dx, int dy) {
        x += dx;

        if (y > 645) {
            n=-1;
        }
        if  (y < 100)
            n = 1;
        y += dy*n;

    }

    public abstract void draw(Graphics g);
    public abstract Animator getAnimator(JComponent component);
}
