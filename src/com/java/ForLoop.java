package com.java;

public class LoopControl {
    public static void main(String[] args){

        for(int i = 0; i < 10; i++){
            System.out.println("hello");
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        int[] grades = {98, 100, 83, 90, 92};

        for(int i = 0; 1 < grades.length; i++)
            System.out.println(grades[i]);
    }
}
