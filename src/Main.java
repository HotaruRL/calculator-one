import java.util.Scanner;

public class Main {
    public static double monthlyMortgageCalc (double P, double i, int n){

        // P = principal amount
        // i = monthly interest rate
        // n = numbers of payments
        return P * (i * Math.pow((1 + i), n)) / (Math.pow((1 + i), n) - 1);
    }

    public static void main(String[] args) {
        // CREATE AN INSTANCE OF SCANNER NAMED s
        Scanner s = new Scanner(System.in);

//        Calculator 1: A mortgage calculator - it is used to calculate out
//        how much a monthly payment for a loan would be (minus any
//        insurance or taxes), as well as how much interest you would pay
//        over the life of the loan.

//        a. It would accept the principal, interest rate, and loan length from the user

//        b. It would display the expected monthly payment and total interest paid

//        Example: A $53,000 loan at 7.625% interest for 15 years would
//        have a $495.09/mo payment with a total interest of $36,115.99

//        This calculator would use a compounded interest formula.
//        M=P×(i*(1+i)^n / ((1+i)^n)-1)

//        - Monthly Payment (M)
//        - Principal (P): This is the total amount of the loan.
//        - Annual Interest Rate (r): The nominal annual interest rate in decimal form (e.g., 7.625% = 0.07625).
//        - Loan Term in Years (y) How many years the loan lasts.
//        - Number of Monthly Payments (n): This is 12×y (Because there are 12 monthly payments per year.)
//        - Monthly Interest Rate (i): This is the annual interest rate divided by 12, i.e. r/12
//        - Total Interest =(M×n)−P

        // INTRO
        System.out.println("\n--------------- Mortgage Monthly Payment Calculator ---------------");

        // USER INPUTS
        System.out.println("\nPlease enter the principal amount (no commas) e.g. 53000: ");
        double principalAmount = s.nextDouble();

        System.out.println("\nPlease enter the loan term in years e.g. 15: ");
        int years = s.nextInt(); // whole numbers of years

        System.out.println("\nPlease enter the annual interest rate e.g. 7.625: ");
        double rawRate = s.nextDouble();
        // convert % yearly rate to monthly rate in decimals
        double monthlyInterestRate = rawRate / 100 / 12;

        // calculate the number of payments behind the scene
        int numberOfPayment = years * 12;

        //OUTPUTS
        double expectedMonthlyPayments = monthlyMortgageCalc(principalAmount, monthlyInterestRate, numberOfPayment);
        double totalInterestPaid = (numberOfPayment * expectedMonthlyPayments) - principalAmount;

        // DISPLAY
        System.out.printf("\nA $%.2f loan at %.3f%% interest for %d years would have\na $%.2f/mo payment with\na total interest of $%.2f\n", principalAmount, rawRate, years, expectedMonthlyPayments, totalInterestPaid);
    }
}