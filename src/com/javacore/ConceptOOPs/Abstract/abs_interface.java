package com.javacore.ConceptOOPs.Abstract;

//tạo interface có 4 phương thức
interface abs_interface {
    void a();
    abstract void b();
    public void c();
    public abstract void d();
}

// tạo abstract class cung cấp cài đặt cho một phương thức của interface A
abstract class B implements abs_interface {
    public void c() {
        System.out.println("I am C");
    }
}

// tạo subclass của abstract class B, cung cấp cài đặt cho các phương thức còn lại
class M extends B {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}

// tạo lớp Test5 để gọi các phương thức của interface A
class Test5 {
    public static void main(String args[]) {
        abs_interface ai = new M();
        ai.a();
        ai.b();
        ai.c();
        ai.d();
    }
}
