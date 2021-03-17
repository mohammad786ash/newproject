package com.java;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // exception: an event that occurs during runtime
        // that disrupts the normal program instruction flow

//        try {
//            int x = 5 / 0;
//        } catch (ArithmeticException e) /*Arithmetic exception used for math, "Exception e" for all mistakes */{
//            System.out.println("you cant divide by 0");;
//        }
//        finally {
//            System.out.println("good-bye.");
//        }

        try {
            System.out.println("before throw");
            throw new ArithmeticException();
        } catch (ArithmeticException ex){
            System.out.println(ex);
        }

    }
}
