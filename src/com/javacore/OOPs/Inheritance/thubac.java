package com.javacore.OOPs.Inheritance;

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

public class thubac {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark(); // compile error
    }
}
