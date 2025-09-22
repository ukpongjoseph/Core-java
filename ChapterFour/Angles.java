package ChapterFour;

import java.util.Scanner;

public class Angles {
    // This program is a software that returns the angles of a triangle. The software returns the angles in a triangle provided the co-ordinates are provided
    public static void main(String args[]){
        // We will be prompting the users to provide the cordinates of the triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the co-ordinate x1 : ");
        double x1 = input.nextDouble();
        System.out.print("Enter the co-ordinate x2 : ");
        double x2 = input.nextDouble();
        System.out.print("Enter the co-ordinate x3 : ");
        double x3 = input.nextDouble();
        System.out.print("Enter the co-ordinate y1 : ");
        double y1 = input.nextDouble();
        System.out.print("Enter the co-ordinate y2 : ");
        double y2 = input.nextDouble();
        System.out.print("Enter the co-ordinate y3 : ");
        double y3 = input.nextDouble();
        // computing the sides a, b and c
        double a = Math.sqrt((x1-x3) * (x1-x3) + (y1-y3) * (y1-y3));
        double b = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
        double c = Math.sqrt((x2-x3) * (x2-x3) + (y2-y3) * (y2-y3));
        // computing angles of each sides in radians
        double radA = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        double radB = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        double radC = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
        // computing the angles using the sides (from radian to degrees)
        double A = Math.toDegrees(radA);
        double B = Math.toDegrees(radB);
        double C = Math.toDegrees(radC);
        System.out.println("The angles are " + Math.round(A * 100)/100.0 + " , " + Math.round(B * 100)/100.0 + " and " + Math.round(C * 100)/100.0 );
        input.close();
    }
}
