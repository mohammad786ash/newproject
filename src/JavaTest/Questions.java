package JavaTest;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        int [] myList = {13, 3, 8, 9, 6, 15};
//
//
//        for(int i=0; i < myList.length; i++){
//            if (i % 3 == 0) {
//                System.out.println(i + " is a multiple of 3");
//            }
//        }
        // Use for loop to add the following number from array [1,3,5,9,8]
//            int [] myList = {1, 3, 5, 9, 8};
//            int sum = 0;
//
//            for(int num : myList){
//                sum = sum+num;
//            }
//        System.out.println("Sum of all the numbers in array is: " + sum);

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a letter");
            char ch = scan.next().charAt(0);


            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is vowel");
            else
                System.out.println(ch + " is constant");

    }
}
//- What are the two ways to get properties from one class to another? Give example with syntax
//Answer - The two ways are extends and implements.
// public class Questions extends Calculator {...}
// public class Questions implements CalculatorInterface {...}

//- What are access modifiers and describe the access level for each
//Answer - these are the access levels this is so certain people can and can not access classes, methods, variables etc..
//public - viewable to the world, private - only visible to the class, protected - visible to the package and subclasses


//- What are difference between class, abstract class and interface
//Answer - the difference between class and abstract class are the abstract class cant be instantiated directly,
//abstract class can have non abstract methods but if there is even one abstract method then the class must be
//abstract. Interface can implement multiple items where as abstract can only extend once, interface abstracts 100% of the data where as abstract class extends 0 - 100 %
//ex.     public class ClassName { }  public abstract class ClassName { } public interface ClassName implements OtherClassInterface { }


//- What's encapsulation and explain how data are access or modified
//Answer - encapsulation wraps the data (variables) and the code acting on the data (methods) in a single unit,
//ex. public void setAge (int newAge) <-- modifying age
// age = newAge;
// public int getAge(){ <-- accessing age
// return age; }

//- Explain the difference between overloading and overriding with example (code)
//Answer - overriding is when two methods have the same name and parameters,
//overriding is when two or more methods have the same name in a class but have different parameters.
//  below is override they have same name and parameter         below is overloading they have same name but different parameter
//Class Dog {                                                       class Dog {
//      public void bark() {                                             public void bark() {
//            system.println("woof");  }                                   system.println("woof"); }
// Class GermanShepard extends Dog {                                 //OVERLOADING
//         @OVERRIDE                                                  public void bark(int num){
//      public void bark () {                                           for(int i=0; i<num; i++)
//              system.println("GRRRRR");    }                              system.println("woof"); } }
