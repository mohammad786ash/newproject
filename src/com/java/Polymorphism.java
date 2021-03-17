package com.java;

class Bird{
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}
class Robin extends Bird{
    public void sing() {
        System.out.println("hmmmmmmmmmmmmm");
    }
}
class Duck extends Bird{
    public void sing() {
        System.out.println("Quack quack");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
   Bird b = new Bird();
   Robin r = new Robin();
   Duck d = new Duck();
    b.sing();
    r.sing(); // even though they are all called sing
    d.sing(); // they have there own ways
    }
}
