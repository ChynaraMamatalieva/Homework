package com.company;

public class Myshyk {
    private String name;
    private int age;
    private String poroda;


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

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
}
