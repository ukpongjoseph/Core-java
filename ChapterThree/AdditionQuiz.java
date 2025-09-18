package ChapterThree;

import java.util.Scanner;

public class AdditionQuiz{
    // One public class per package
    // No method nested in a method
    // All codes should be inside the public class
    // Execution starts from main

    // The method below is a program that generates a mathematical quiz based on addition, we then prompt users to answer the question and then the proram checks the user answer whether it is true or false
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double firstNum = System.currentTimeMillis()%10;
        double secondNum = System.currentTimeMillis()/7%10;
        double programAnswer = firstNum + secondNum ;
        System.out.print("What is " + firstNum + " + " + secondNum + " ? ");
        double answer = input.nextDouble();
        boolean result = programAnswer == answer;
        System.out.println(firstNum + " + " + secondNum + " = " + answer + " is " + result);
        input.close();
    }
}