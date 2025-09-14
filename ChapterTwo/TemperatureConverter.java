package ChapterTwo;

import java.util.Scanner;

// One public class per package
    // No method nested in a method
    // All codes should be inside the public class
    // Execution starts from main
public class TemperatureConverter {
    // This programs converts Fahrenheit to Celcius
    public static double FahrCelc(double fahr){
        double result = 5 * (fahr - 32)/9;
        System.out.println(result);
        return result;
    }
    public static void main(String args[]){
        System.out.println("This program will be converting temperatures from Fahrenheit to Celcius !!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        double fahr = input.nextDouble();
        FahrCelc(fahr);
        input.close();
        // method that displays current time in milliseconds from epoch
        double time = System.currentTimeMillis();
        System.out.println(time);
    }
}
