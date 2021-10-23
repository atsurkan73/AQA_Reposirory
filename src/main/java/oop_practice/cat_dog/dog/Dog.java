package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.print("I am a Dog. May name is " + name + ". Gav");
    }
}

