package org.dstu.domain;

public abstract class Animal implements IUniversityPerson {
    private String NameAnimal;
    private String arial;
    private String weight;

    public Animal() {
    }

    public Animal(String NameAnimal, String arial, String weight) {
        this.NameAnimal = NameAnimal;
        this.arial = arial;
        this.weight = weight;
    }

    public Animal(String[] line) {
        weight = line[1];
        arial = line[2];
        weight = line[3];
    }

    public String getNameAnimal() {
        return NameAnimal;
    }

    public void setNameAnimal(String NameAnimal) {
        this.NameAnimal = NameAnimal;
    }

    public String getarial() {
        return arial;
    }

    public void setarial(String arial) {
        this.arial = arial;
    }

    public String getweight() {
        return weight;
    }

    public void setweight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Наименование вида: ");
        builder.append(NameAnimal);
        builder.append(" | Место обитания животного: ");
        builder.append(arial);
        builder.append(" | Примерный вес животного: ");
        builder.append(weight);
        return builder.toString();
    }
}
