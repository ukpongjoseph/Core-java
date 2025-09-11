package ChapterTwo;

import java.util.Scanner;

// One public class per package
// No method nested in a method
// All codes should be inside the public class
// Execution starts from main
public class Average {
    // method is static as it will be executed inside main method which is static
    // method takes three parameters and calculate their average

    public static double avg(int num1, int num2, int num3){
        return (num1 + num2 + num3)/3 ;
    }
    public static void main(String args[]){
        // Using Scanner Object to read inputs from console and then using the next in-built method to convert inputs to type of choice and then storing them inside a variable of compatible type
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        Scanner third = new Scanner(System.in);

        // Prompting users for numbers and saving the inputs
        System.out.println("We will be calculating the average of three numbers !!!!");
        System.out.print("Enter your first number : ");
        int num1 = first.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = second.nextInt();
        System.out.print("Enter your third number : ");
        int num3 = third.nextInt();
        double result = avg(num1, num2, num3);
        first.close();
        second.close();
        third.close();
        System.out.print("The average of " + num1 + " , " + num2 + " and " + num3 + " is " + result);
    }
}
