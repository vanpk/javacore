package com.javacore.OOPs.Encapsulation;

public class Donggoi {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class donggoi {
    public static void main(String[] args) {
        Donggoi s = new Donggoi();
        s.setName("Hai");
        System.out.println(s.getName());
    }
}
