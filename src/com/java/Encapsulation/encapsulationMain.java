package com.java.Encapsulation;

public class encapsulationMain {
    public static void main(String[] args) {
        //Encapsulation in Java is a mechanism of wrapping the data (variables)
        //and code acting on the data (methods) together as a single unit.

        Student s = new Student();
        s.setName("Mo");
        s.setAge(23);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
