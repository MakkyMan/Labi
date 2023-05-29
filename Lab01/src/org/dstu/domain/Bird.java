package org.dstu.domain;

public class Bird extends Animal {
    private String wings;
    private String fly;
    private String color;

    public Bird() {
    }

    public Bird(String[] line) {
        super(line[1], line[2], line[3]);
        wings = line[4];
        fly = line[5];
        color = line[6];
    }

    public String getwings() {

        return wings;
    }

    public void setwings(String wings) {

        this.wings = wings;
    }

    public String getfly() {

        return fly;
    }

    public void setfly(String fly) {

        this.fly = fly;
    }

    public String getcolor() {

        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Птица: ");
        builder.append(super.toString());
        builder.append(" | Размах крытьев: ");
        builder.append(wings);
        builder.append(" | Способность к полёту: ");
        builder.append(fly);
        builder.append(" | Окрас перьев: ");
        builder.append(color);
        return builder.toString();
    }
}
