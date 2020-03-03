package com.javacore.ConceptOOPs.This;

public class return_Instance {
    return_Instance getA() {
        return this;
    }
    void msg() {
        System.out.println("Sử dụng từ khóa this để trả về instance của lớp hiện tại");
    }
}

class Test1 {
    public static void main(String args[]) {
        new return_Instance().getA().msg();
    }
}

