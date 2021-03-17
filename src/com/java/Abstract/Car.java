package com.java.Abstract;

public class Car extends Vehicle{
    @Override
    void go() {
        System.out.println("The car is driving");
    } // must specify what go does if you want to extend a abstract class
}
