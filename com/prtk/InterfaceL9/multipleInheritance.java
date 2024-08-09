package com.prtk.InterfaceL9;
interface A {
     void run();
}
interface B {
     void run();
}
class C implements A,B{     // like: child of 2 parent
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
