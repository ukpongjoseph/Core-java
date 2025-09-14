package ChapterTwo;

import java.util.Scanner;

public class SecondsToMinutes {
    // One public class per package
    // No method nested in a method
    // All codes should be inside the public class
    // Execution starts from main

    // Method takes time in seconds and return the equivalent in minutes and seconds
    public static void timeConverter(int time){
        int minutes = time / 60;
        int seconds = time % 60;
        System.out.println(time + " seconds is " + minutes + " minutes and " + seconds + "seconds" );
    }
    public static void main(String args[]){
        // creating Scanner object
        Scanner input = new Scanner(System.in);

        // prompting users for time in seconds
        System.out.print("Enter your time in seconds to get its minutes and seconds equivalent : ");
        int time = input.nextInt();
        timeConverter(time);
        input.close();
        double base = 34;
        int power = 3;
        // The result of Math.pow(a, b) method is a double precision value so any variable holding the result must be of double data type 
        double result = Math.pow(base, power);
        System.out.println(result);
    }
}
