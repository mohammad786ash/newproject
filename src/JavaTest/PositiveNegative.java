package JavaTest;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = scan.nextInt();
        if (number < 0){
            System.out.println("The number you entered is negative");
        }
        else {
            System.out.println("The number you entered is positive");
        }
    }
}
