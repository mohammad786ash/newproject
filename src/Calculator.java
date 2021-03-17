public class Calculator {
    public static void main(String[] args) {
       int age = 101;

       if (age > 18){
           if (age > 100){
               System.out.println("RIP");
           }
           else {
               System.out.println("you are a adult");
           }
       }
       else if (age < 18){
           System.out.println("you are a child");
       }

       else if (age < 0){
           System.out.println("You are not born yet");
       }
       else
           System.out.println("please enter your age");
    }
}
