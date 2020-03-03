package com.javacore.ConceptOOPs.This;

public class constructor_Call {
    int id;
    String name;
    String city;
    constructor_Call() {
        System.out.println("call Constructor mặc định");
    }

    constructor_Call(int id, String name) {
        this(); // nó được sử dụng để gọi Constructor của lớp hiện tại
        this.id = id;
        this.name = name;
    }

    constructor_Call(int id, String name, String city){
        this(id,name);
        this.city = city;
    }

    void display() {
        System.out.println(id + " " + name + " " + "thanh pho " + city);
    }

    public static void main(String args[]) {
        constructor_Call e1 = new constructor_Call(111, "Queen");
        constructor_Call e2 = new constructor_Call(222, "Joker", "Zou");
        constructor_Call e3 = new constructor_Call(333, "King","Water");
        e1.display();
        e2.display();
        e3.display();
    }
}
