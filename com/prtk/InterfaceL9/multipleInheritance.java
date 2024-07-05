package com.prtk.InterfaceL9;
interface A {
     void run();
}
interface B {
     void run();
}
class C implements A,B{
    @Override
    public void run() {
        System.out.println("C Method runs");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.run();
    }
}
