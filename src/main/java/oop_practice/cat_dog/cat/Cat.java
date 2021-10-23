package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.print("I am a Cat. May name is " + name + ". Mew");
    }
}

