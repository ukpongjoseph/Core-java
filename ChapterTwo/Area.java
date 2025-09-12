package ChapterTwo;
// There can be only one public class per package/file

// In this module, we will be creating a function or method to calculate the area of a circle with a radius provided as parameter. Note in java, Methods cannot be nested inside another method
public class Area {

    // declaring the function or method outside the main method
    // It would be noted that the static keyword is used on the "solve" method and that is because we will be calling this method in the main method which is static
    public static double solve(int radius){
        System.out.println("The area of a circle with radius " + radius + " is " + 3.142* radius* radius);
        return (radius * radius * 3.142);
    }
    public static void main(String[] args){
        // The final keyword signifies that radii is a constant and its value cannot be changed or it cannot be reassigned a new value
        final int radii = 20;
        double result = solve(radii);
        System.out.println(result);
    }
}
