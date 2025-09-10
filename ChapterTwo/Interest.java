package ChapterTwo;
// There can be only one public class per package/file

// main is a method and as by development, methods cannot be nested inside methods especially the main method
public class Interest {
    // The method below calculates the total payment for a loan. it takes three parameters, the loan amount, the time to pay and the interest rate
    // It would be noted that the static keyword is used on the "Total" method and that is because we will be calling this method in the main method which is static
    public static double Total (double amount, double rate, double time){
        double totalPayment = (amount * rate * time)/100;
        System.out.println(totalPayment);
        return totalPayment;
    }
    public static void main (String args[]) {
        double returnPayment = Total(2000,2,3);
        System.out.println(returnPayment);
    }
}