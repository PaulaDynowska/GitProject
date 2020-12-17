package com.company;

public class Main {

    public static void main(String[] args) {


        Zombie z1 = new Zombie("Ugly Bob", TypeOFZombie.CRAWLER, 55);
        Zombie z2 = new Zombie("Little Bobby", TypeOFZombie.BRAIN_SEEKER, 12);
        Zombie z3 = new Zombie("Pretty Bob", TypeOFZombie.ZOMBIE_PRINCESS, 21);
        Zombie z4 = new Zombie("Dead Bob", TypeOFZombie.DEAD, 99);

        System.out.println(z1.toString());
        System.out.println(z2.toString());
        System.out.println(z3.toString());

        Person p1 = new Person("Jake", "Baker", 87);
        System.out.println(p1.toString());

        Car c1 = new Car("Jeep", "Cherokee", 2020);
        System.out.println(c1);
        System.out.println("22");


    }


}
