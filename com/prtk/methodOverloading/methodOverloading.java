//LECTURE 12(1)
package com.prtk.methodOverloading;
 class methodOverloading {
    public static int sum(int a, int b) {
        return (a + b);
    }

    public static int sum(int a, int b, int c) {
        return (a + b+ c);
    }

    public static String sum(String a, String b) {
        return (a + b);
    }

    public static void main(String[] args) {
        // since all were static therefore no need to create an instance of class
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2,4));
        System.out.println(sum("Kunal", " Kushwaha"));
    }
}
