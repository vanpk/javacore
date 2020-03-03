package com.javacore.ConceptOOPs;

import java.util.HashSet;
import java.util.Set;

public class Equal {
    public static void main(String[] args) {
        String s1 = new String("This is a string");
        String s2 = new String("This is a string");

        System.out.println("s1 == s2: " + (s1 == s2)); //2 obj khac nhau, vị trí khác nhau
        System.out.println("s1.equals(s2): " + (s1.equals(s2))); // cùng value
    }
}
//ghi đè equal() & hashCode()
class Student {
    private String id;
    private String name;
    private String email;
    private int age;

    public Student(String id) {
        this.id = id;
    }
    //hashCode() giúp k trùng lặp 2 obj student1 & student2
    public int hashCode(){
        return id.hashCode();
    }
    public Student(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + email;
        studentInfo += " - " + age;
        return studentInfo;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student another = (Student) obj;
            if (this.id.equals(another.id)) {
                return true;
            }
        }
        return false;
    }
}
class EqualStudent3 {
    public static void main(String[] args) {
        Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);

        Set<Student> setStudents = new HashSet<Student>();
        setStudents.add(student1);
        setStudents.add(student2);
        setStudents.add(student3);

        // in các phần tử của set ra màn hình
        for (Student student : setStudents) {
            System.out.println(student);
        }
    }
}