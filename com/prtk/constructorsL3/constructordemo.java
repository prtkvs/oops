package com.prtk.constructorsL3;

//    ** we use the constructor to initialize the instance variable of the class.**

//LECTURE 3
 class ABC{
    String name;
    int age;

    public ABC(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("this is runned succesfully");
    }
}

public class constructordemo {
    public static void main(String[] args) {
        ABC obj = new ABC("Sunny",32);  // does not print sunny ,32 instead this is used to run the constructor
    }
}
