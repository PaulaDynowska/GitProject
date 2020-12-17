package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello! ");
//        System.out.println("This is kinda magic....");
//        System.out.println("bla bla");
//        System.out.println("Another one bites the dust....");
//        System.out.println("turururururur");
//        System.out.println("Another one here");

        Zombie z1 = new Zombie("Ugly Bob", "Crawler", 55);
        Zombie z2 = new Zombie("Little Bobby", "Brain Seeker", 12);
        Zombie z3 = new Zombie("Pretty Bob", "Zombie Princess", 21);

        System.out.println(z1.toString());
        System.out.println(z2.toString());
        System.out.println(z3.toString());

        Person p1 = new Person("Jake", "Baker", 87);
        System.out.println(p1.toString());
    }

}
