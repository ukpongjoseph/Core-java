package ChapterTwo;
// There can be only one public class per package/file

// import Scanner Object so as to be able to read inputs or otpus from stdout
import java.util.Scanner;

// In this module we will be dealing with the scanner object so as to read inputs from the console rather than use static values when dealing with methods
public class Perimeter {
    // This method will be calculating the perimeter of a 2D shape
    public static double perimeter(double lenght, double breadth){
        double result = lenght * breadth;
        System.out.println("The perimeter of your shape with lenght of " + lenght + " and breadth of " + breadth + " is " + result + "");
        return result;
    }
    public static void main (String args[]) {
        // we will be calling the method, "perimeter" here but rather thn passing static value, we will be reading values or inputs from the console, storing them in a variable and then using them for the method

        // To be able to read inputs from the stdout, we need a Scanner object. The Scanner object is created using the new keyword(just like invoking a constructor to create an object). The Scanner address is stored in the reference variables, first and second. Now that the we have the Scanner object, it needs to be able to read inputs and store input values in a variable for use and there is an inbuilt method for it, object.nextDouble (to read and store double data type numbers). Other examples includes object.nextInt (to store integers), object.nextLine (to read Strings) and there are many more

        // creating Scanner Objects
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);

        // Prompting users for values
        System.out.println("Enter your lenght");
        // Reading values from console and storing them as double data type
        double lenght = first.nextDouble();
        // Prompting users for values
        System.out.println("Enter your breath");
        // Reading values from console and storing them as double data type
        double breadth = second.nextDouble();
        // calling method
        perimeter(lenght, breadth);
        // When creating scanner objects, there is almost likely a resource leak (this can consume memory and cause attacks). so we close the scanners after use using the close() method
        first.close();
        second.close();
    }
}
