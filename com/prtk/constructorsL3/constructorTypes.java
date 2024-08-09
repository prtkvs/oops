package com.prtk.constructorsL3;

//LECTURE 3
class ABC1{  //** we can't name this as ABC also since same package me 2 same named class nhi ho skte
    String name;
    int age;

    public ABC1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor");
    }

    public ABC1() {     //automatically invokes implicitly during the instantiation
        System.out.println("Default Constructor");
    }
}

public class constructorTypes {
    public static void main(String[] args) {
//        ABC1 obj1 = new ABC1("Sunny",32);  //Parameterized Constructor
        ABC1 obj2 = new ABC1();
    }
}
