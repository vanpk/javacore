package com.javacore.OOPs.Overloading;
class Addr{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
class napchong_doikieudulieu{
    public static void main(String[] args){
        System.out.println(Addr.add(11,11));
        System.out.println(Addr.add(12.3,12.6));
    }
}
//Trong java, không thể nạp chồng phương thức bằng cách chỉ thay đổi kiểu trả về của phương thức. ==> sd đổi tham số
