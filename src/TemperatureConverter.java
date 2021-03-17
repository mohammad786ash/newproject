import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1 to convert from Fahrenheit to Celsius");
        System.out.println("enter 2 to convert from Celsius to Fahrenheit");
        int choice = scan.nextInt();

        double temperature = 0.0;
        double converted = 0.0;

        if (choice == 1) {
            System.out.println("Enter the temperature in Fahrenheit");
            temperature = scan.nextDouble();
            converted = (temperature-32)* 5/9;
            System.out.println("Temperature in Celsius is " + converted);
        } else if (choice == 2) {
            System.out.println("Enter the temperature in Celsius");
            temperature = scan.nextDouble();
            converted = (temperature* 9/5) + 32;
            System.out.println("Temperature in Fahrenheit is " + converted);
        } else
            System.out.println("please type only 1 or 2");
    }
}