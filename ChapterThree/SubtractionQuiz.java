package ChapterThree;

import java.util.Scanner;

public class SubtractionQuiz {
    // This program is a random quiz generator that generates a subtraction quiz. We generate two numbers (num1 and num2), if num1 is less than num2...we switch their values (we create a temporary variable. if num2 is greater than num1. the temporary variable holds num1 value while we update num1 with num2 value and then update num2 with temp value), present the question to the user, check their answer if it correct and then sends a reply is their answer is correct or not.
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int temp;
        if(num2 > num1){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("What is " + num1 + " - " + num2 + " ? : ");
        int answer = input.nextInt();
        if(answer == (num1 - num2))
            System.out.println("Your answer is correct");
        else
            System.out.println("Your answer is wrong, the correct answer is " + (num1-num2));
        input.close();
    }
}
