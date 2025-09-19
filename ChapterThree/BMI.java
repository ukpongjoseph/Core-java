package ChapterThree;

import java.util.Scanner;

public class BMI {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("We will be checking your Body Mass Index, Please provide the necessary informations");
        System.out.print("Enter your weight in Pounds : ");
        double weight = input.nextDouble() * 0.45359237;
        System.out.print("Enter your height in inches : ");
        double height = input.nextDouble() * 0.0254;
        double BMI = weight / (height * height);
        String range;
        if(BMI < 18.5){
            range = "Underweight";
        }else if(BMI < 25.0 && BMI >= 18.5){
            range = "Normal";
        }else if(BMI >= 25.0 && BMI < 30.0){
            range = "Overweight";
        }else{
            range = "Obese";
        }
        System.out.println("Your BMI is " + BMI + " which is " + range);
        input.close();
    }
}
