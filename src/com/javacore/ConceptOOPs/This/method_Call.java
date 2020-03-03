package com.javacore.ConceptOOPs.This;

public class method_Call {
    void m() {
        System.out.println("Gọi phương thức bằng từ khóa this");
    }

    void n() {
        this.m();
    }

    void p() {
        n();// trình biên dịch sẽ thêm this để gọi phương thức n() như this.n()
    }

    public static void main(String args[]) {
        method_Call e1 = new method_Call();
        e1.p();
    }
}
