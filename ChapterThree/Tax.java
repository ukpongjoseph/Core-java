package ChapterThree;

import java.util.Scanner;

public class Tax {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your taxable Income : $");
        double income = input.nextDouble();
        System.out.print("Enter your filing status. Enter 0 for single, 1 for married (jointly or qualified widow), 2 for married filing seperately, 3 for head of household : ");
        int status = input.nextInt();
        double tax;
        if(status == 0){
            if(income <= 8350){
                tax = income * 0.1;
            }else if(income > 8350 && income <= 33950){
                tax = (0.1 * 8350) + ((income - 8350) * 0.15);
            }else if (income > 33950 && income <= 82250){
                tax = (0.1 * 8350) + (25599 * 0.15) + ((income - 33951) * 0.25);
            }else if (income > 82251 && income <= 171550){
                tax = (0.1 * 8350) + (25599 * 0.15) + (48299 * 0.25) + ((income - 82251) * 0.28);
            }else if (income > 171551 && income <= 372950){
                tax = (0.1 * 8350) + (25599 * 0.15) + (48299 * 0.25) + (89299 * 0.28) + ((income - 171551) * 0.33);
            }else{
                tax = (0.1 * 8350) + (25599 * 0.15) + (48299 * 0.25) + (89299 * 0.28) + (201399 * 0.33) + ((income - 372950) * 0.35);
            }
            System.out.println("Your tax is " + tax);
        }
        input.close();
    }
}
