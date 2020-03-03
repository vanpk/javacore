package com.javacore.ConceptOOPs.This;

public class instance_variables {
    int id;
    String name;

    instance_variables(int id, String name) {
        this.id = id;       //tham chieu toi bien instance
        this.name = name;   //neu k co this se bi null
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        instance_variables s1 = new instance_variables(111, "Viet");
        instance_variables s2 = new instance_variables(222, "Nam");
        s1.display();
        s2.display();
    }
}
