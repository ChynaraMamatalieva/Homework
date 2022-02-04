package com.company;

public class It {
    private String name;
    private String poroda;
    private int cost;


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

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
