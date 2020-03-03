package com.javacore.ConceptOOPs;

import java.util.concurrent.ArrayBlockingQueue;

class constructor{
        int id;
        String name;

        constructor(int i, String n){ // co parameters truyen vao
            id = i;
            name = n;
        }
        constructor(){ // k tao constructor trinh bien dich tu them vao
            System.out.println("defalt constructor");
        }
        void display() {
            System.out.println(id + " " + name);
        }

        public static void main(String args[]) {
            constructor s1=new constructor();
            constructor s2=new constructor(001, "King");
            s1.display();
            s2.display();
        }
    }

