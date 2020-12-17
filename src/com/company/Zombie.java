package com.company;

public class Zombie {
    private String name;
    private String type;
    private int age;

    public Zombie(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Type: " + type + " Age: " + age;
    }
}
