package com.company;

public class Main {

    public static void main(String[] args) {

        Myshyk cat = new Myshyk();
        cat.setName("Murka");
        cat.setPoroda("Mein-kun");
        cat.setAge(5);
        System.out.println(cat.getName()+" "+cat.getPoroda()+" "+cat.getAge());


        Popugai popugai = new Popugai();
        popugai.setName("Kolya");
        popugai.setAge(3);
        popugai.setColor("Yellow");
        System.out.println(popugai.getName()+" "+popugai.getAge()+" "+popugai.getColor());



        Balyk balyk = new Balyk();
        balyk.setName("Forel");
        balyk.setColor("Radujnyi");
        balyk.setWeight(2);
        System.out.println(balyk.getName()+" "+balyk.getColor()+" "+balyk.getWeight());


        It dog = new It();
        dog.setName("Tor");
        dog.setPoroda("Ovcharka");
        dog.setCost(12000);
        System.out.println(dog.getName()+" "+dog.getPoroda()+" "+dog.getCost());



    }
}
