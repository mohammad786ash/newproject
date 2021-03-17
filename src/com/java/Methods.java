package com.java;

public class Methods {
    public static void main(String[] args) {
//        System.out.println("welcome to our calculator");
//        int a = 5;
//        int b = 10;
//        System.out.println(a * b);
//
//        int s = 3;
//        int d = 6;
//        System.out.println(s * d);
//
//        int x = 2;
//        int v = 8;
//        System.out.println(x * v);

//        welcome();
//        multiply(5, 10);
//        multiply(3,6);
//        multiply(2, 8);

//        printCarData("BMW", "Red", 2020);
//        printCarData("Nissan", "blue", 2010);
//        printCarData("lexus", "black", 2016);

    smallestNumber(10, 20, 30);
    smallestNumber(244, 33, 43);
    smallestNumber(43, 4, -22);

    }

//    public static void welcome(){
//        System.out.println("welcome to our calculator");
//    }
//
//    public static void multiply(int a, int b){
//        System.out.println(a*b);
//    }

//    public static void printCarData(String model, String color, int year){
//    String fullSentence = "I have a " + color + " "+ year +" " + model;
//    System.out.println(fullSentence); }

        public static void smallestNumber(int a, int b, int c) {
            if (a < b && a < c)
                System.out.println(+ a +  " is the smallest number");
            else if (b < a && b < c)
                System.out.println(+ b + "is the smallest");
            else
                System.out.println("c is the smallest");
        }


}
