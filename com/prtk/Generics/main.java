package com.prtk.Generics;

public class main {
    static class Dog<E>{
        E id;
        public Dog(E id){
            this.id = id;
        }
        E getId(){
            return id;
        }
    }
    static class Animal<T,V>{
        T id ;
        V name;
        public Animal(T id, V name){
            this.id = id;
            this.name = name;
        }
    }
    static <T> void genericMethod(T data){
        System.out.println(data);
    }
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("abc");
        Animal<Integer , String> a1 = new Animal<>(2323,"hello");
        Animal<Integer , Integer> a2 = new Animal<>(2323,332);
        genericMethod(2112);
        genericMethod("integer and string both");
        System.out.println(a1);     // address value
        System.out.println(d1.getId());
    }
}
