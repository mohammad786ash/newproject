package com.java.Interfaces;

//An interface is a completely "abstract class"
//that is used to group related methods with empty bodies:

interface WaterBottleInterface {
    String color = "blue";
    void fillUp();
}

public class interfaceExample implements WaterBottleInterface {
    public static void main(String[] args) {
        System.out.println(color);

        interfaceExample ex = new interfaceExample();
        ex.fillUp();

    }
    @Override
    public void fillUp() {
        System.out.println("it is filled");
    }
}
