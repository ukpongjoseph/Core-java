package ChapterTwo;

import java.util.Scanner;

// One public class per package
    // No method nested in a method
    // All codes should be inside the public class
    // Execution starts from main
public class Loan {
    // The method below is used for a loan app where users are prompted to choose loan amount and annual rate. Then the program returns the total amount and monthly amount users will repay
    public static void loan(int amount, double rate){
        double TotalPayment = (amount * rate )/100;
        double monthlyPayment = TotalPayment/12;
        System.out.println("You are to pay a total of $" + TotalPayment + " and $" + monthlyPayment + " Monthly " + "for a loan of $" + amount);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your loan amount : $");
        int amount = input.nextInt();
        System.out.print("Enter your loan rate : ");
        double rate = input.nextDouble();
        loan(amount, rate);
        input.close();
    }
}
