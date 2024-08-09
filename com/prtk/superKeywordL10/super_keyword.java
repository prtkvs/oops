//LECTURE 10(1)
// super - used when if same attribute is declared in both parent and child class
// then to call parent one we use "super.(variable)"
package com.prtk.superKeywordL10;
class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    void printcolor(){
        System.out.println(color);    //color of dog class
        System.out.println(super.color);       //color of animal(parent) class
    }
}
public class super_keyword {
    public static void main(String[] args) {
    Dog obj = new Dog();
    obj.printcolor();
    }
}
