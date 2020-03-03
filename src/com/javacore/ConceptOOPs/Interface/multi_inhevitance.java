package com.javacore.ConceptOOPs.Interface;

public interface multi_inhevitance {
    void print();
}

interface Showable{
    void show();
}

class A7 implements multi_inhevitance,Showable {

    public void print() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
