package ChapterThree;

import java.util.Scanner;

public class SimpleIfDemo {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // Always prompt users before storing values in scanner object
        System.out.print("Enter any number of your choice : ");
        int value = input.nextInt();
        if(value % 5 == 0)
            System.out.println("Hi, Five");
        else if (value % 2 == 0) 
            System.out.println("Hi, Even");
        else
            System.out.println(value + " is not a multiple of 5 or 2");
        
        input.close();
    }
}
