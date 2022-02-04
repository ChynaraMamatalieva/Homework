package com.company;

public class Popugai {
    private String name;
    private String color;
    private int age;


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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
        this.age = age;
    }else{
            System.out.println("error! age cannot be less than 0");
        }
}
}
