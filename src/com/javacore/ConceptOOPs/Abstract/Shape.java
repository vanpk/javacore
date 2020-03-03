package com.javacore.ConceptOOPs.Abstract;
// ke thua lop abstact
abstract class Shape {
    abstract void draw();
}
//Trong tinh huong nay, trinh trien khai duoc cung cap boi ai do,
// vi du: nguoi su dung cuoi cung nao do
class Rectangle extends Shape{
    void draw(){
        System.out.println("Ve hinh chu nhat");
    }
}

class Circle1 extends Shape{
    void draw(){
        System.out.println("Ve hinh tron");
    }
}

//Trong tinh huong nay, phuong thuc duoc goi boi lap trinh vien hoac nguoi dung
class TestAbstraction1{
    public static void main(String args[]) {
        // Trong tinh huong nay, doi tuong duoc cung cap thong qua phuong thuc,
        // chang han nhu getShape()
        Shape s = new Circle1();
        s.draw();
    }
}
