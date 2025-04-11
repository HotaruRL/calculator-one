import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Calculator 1: A mortgage calculator - it is used to calculate out
//        how much a monthly payment for a loan would be (minus any
//        insurance or taxes), as well as how much interest you would pay
//        over the life of the loan.

//        a. It would accept the principal, interest rate, and loan length
//        from the user

        // CONSTANTS
        int MONTHS_IN_A_YEAR = 12;

        // USER INPUTS
        Scanner s = new Scanner(System.in);
        System.out.print("Principal Amount (no commas) e.g. 53000: ");
        double principalAmount = s.nextDouble();

        System.out.print("Number of Years e.g. 15: ");
        int years = s.nextInt(); // whole numbers of years

        System.out.print("Yearly Interest Rate e.g. 7.625: ");
        double rawRate = s.nextDouble(); // 0-100 with fraction

        // MATHEMATICAL INPUTS
        double yearlyInterestRate = rawRate / 100; // convert % to decimals
        double  monthlyInterestRate = yearlyInterestRate / MONTHS_IN_A_YEAR;
        int numberOfPayment = years * MONTHS_IN_A_YEAR; // # of years time 12 months of the year


        //OUTPUTS
        double expectedMonthlyPayments = 0;
        // totalInterestPaid = total with interest - total without interest
        double totalInterestPaid = (numberOfPayment * expectedMonthlyPayments) - principalAmount;

        // DO WORK
//        This calculator would use a compounded interest formula.
//        M=P×(i*(1+i)^n / ((1+i)^n)-1)

        expectedMonthlyPayments = principalAmount * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayment)) / (Math.pow((1 + monthlyInterestRate), numberOfPayment) - 1);

//        - Monthly Payment (M)
//        - Principal (P): This is the total amount of the loan.
//        - Annual Interest Rate (r): The nominal annual interest rate in
//        decimal form (e.g., 7.625% = 0.07625).
//        - Loan Term in Years (y) How many years the loan lasts.
//        - Number of Monthly Payments (n): This is 12×y (Because
//                there are 12 monthly payments per year.)
//        - Monthly Interest Rate (i): This is the annual interest rate
//        divided by 12, i.e. r/12
//        - Total Interest =(M×n)−P

//        b. It would display the expected monthly payment and total
//        interest paid

        System.out.printf("Expected Monthly Payment Amount: $%.2f \n", expectedMonthlyPayments);
        System.out.printf("Total Interest Paid: $%.2f \n", totalInterestPaid);





//        Example: A $53,000 loan at 7.625% interest for 15 years would
//        have a $495.09/mo payment with a total interest of $36,115.99
    }
}