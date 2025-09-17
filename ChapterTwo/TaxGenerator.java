package ChapterTwo;

import java.util.Scanner;

public class TaxGenerator {
    // One public class per package
    // No method nested in a method
    // All codes should be inside the public class
    // Execution starts from main

    // The method below is a tax generator, it generate a tax amount for users purchase depending on the goods they buy
    public static void Tax(int amount){
        double tax = 0.06 * amount ;
        System.out.println("The tax you are to pay for your product of price " + amount + " is $" + tax);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of your goods : ");
        int amount = input.nextInt();
        Tax(amount);
        input.close();
    }
}
