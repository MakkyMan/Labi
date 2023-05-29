package org.dstu.domain;

public class Mammal extends Animal {
    private String tail;
    private String swim;
    private String wool;

    public Mammal() {
    }

    public Mammal(String[] line) {
        super(line[1], line[2], line[3]);
        tail = line[4];
        swim = line[5];
        wool = line[6];
    }

    public String gettail() {
        return tail;
    }

    public void settail(String tail) {
        this.tail = tail;
    }

    public String getswim() {
        return swim;
    }

    public void setswim(String swim) {
        this.swim = swim;
    }

    public String getwool() {
        return wool;
    }

    public void setwool(String wool) {
        this.wool = wool;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Животное: ");
        builder.append(super.toString());
        builder.append(" | Наличие хвоста: ");
        builder.append(tail);
        builder.append(" | Умение плавать: ");
        builder.append(swim);
        builder.append(" | Цвет шерсти: ");
        builder.append(wool);
        return builder.toString();
    }
}
