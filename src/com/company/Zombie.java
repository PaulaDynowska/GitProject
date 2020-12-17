package com.company;

public class Zombie {
    private String name;
    private TypeOFZombie type;
    private int age;

    public String getName() {
        return name;
    }

    public TypeOFZombie getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public Zombie(String name, TypeOFZombie type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                '}';
    }
}
