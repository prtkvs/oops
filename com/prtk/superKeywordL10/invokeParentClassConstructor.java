package com.prtk.superKeywordL10;
// Lecture -10(3)
class Animal3{
    public Animal3() {
        System.out.println("animal is created");
    }
}
class Dog3 extends Animal3{
    public Dog3() {
        super();
        System.out.println("dog is created");
    }
}
public class invokeParentClassConstructor {
    public static void main(String[] args) {
        Dog3 d = new Dog3();    //since we already know constructor already called
    }
}
