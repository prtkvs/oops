package com.prtk.superKeywordL10;
// Lecture -10(2)
class action{
    void eat(){
        System.out.print("eating...");
    }
    void bark(){
        System.out.println("...at night");
    }
}
class Dog2 extends action{
    @Override
    void eat(){
        System.out.println("bread");
    }
    void bark(){
        System.out.print("Barks");
    }
    void work(){
        super.eat();
        eat();
        bark();
        super.bark();
    }
}
public class invokeParentClassMethod {
    public static void main(String[] args) {
        Dog2 d= new Dog2();
        d.work();
    }
}
