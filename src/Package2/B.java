package Package2;
import Package1.A; //to import class A only
//import Package1.*; // to import the whole package using wildcard


public class B {
    public static void main(String[] args) {
        Package1.A object = new Package1.A();
        object.display();
    }
}
