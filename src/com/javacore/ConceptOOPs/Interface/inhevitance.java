package com.javacore.ConceptOOPs.Interface;

interface inhevi {
    void print();
}
interface Show extends inhevi{
    void show();
}
class Testinterface implements Show{

    public void print() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        Testinterface obj = new Testinterface();
        obj.print();
        obj.show();
    }
}
