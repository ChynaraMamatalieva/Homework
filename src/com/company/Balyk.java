package com.company;

public class Balyk {
    private String name;
    private int weight;
    private String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-Za-z]*")) {
            this.name = name;
        } else {
            System.out.println("error name is not valid");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
