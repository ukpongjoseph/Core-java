package ChapterTwo;
// There can be only one public class per package/file

import java.util.Scanner;

// In this module, we will be creating a mini calculator where by user provides two number and we ask what operation the user want to perform

// check to ensure that all codes are inside the public class


public class Calculator {
    // In comparing the op (operation), we don't use op === "add" or op == "add" as op is a String and Strings in java are objects. so in comparing op with "add" or "sub", weare actually comparing references of the object. Hence, we use .equals() to compare the sring value
    public static double Calc(double num1, double num2, String op){
        if(op.equals("addition")){
            return num1 + num2;
        }else if (op.equals("substraction")){
            return num1 - num2;
        }else if (op.equals("multiplication")){
            return num1 * num2;
        }else if (op.equals("division")){
            return num1/num2;
        }else{
            return 0.00;
        }
    }
    public static void main(String args[]){
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        Scanner third = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        double num1 = first.nextDouble();
        System.out.print("Enter your second number : ");
        double num2 = second.nextDouble();
        System.out.print("What operation would you like to perform ?...Choose between addition, substraction, multiplication and division, NB: Choices are case sensitive : ");
        String operation = third.nextLine();
        double result = Calc(num1, num2, operation);
        System.out.println("The " + operation + " of " + num1 + " and " + num2 + " is " + result);
        first.close();
        second.close();
        third.close();
    }
}
