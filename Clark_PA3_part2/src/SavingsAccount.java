public class SavingsAccount {

    static double annualInterestRate;
    private double savingsBalance;

    //DONT FORGET TO CALL THIS METHOD BEFORE CALCULATING FINAL RESULT
    public void calculateMonthlyInterest(){

        savingsBalance += savingsBalance * (annualInterestRate / 12);

    }

    public double getSavingsBalance(){

        return savingsBalance;
    }

    public SavingsAccount(double savingsBalance){

        this.savingsBalance = savingsBalance;
    }


    public static void modifyInterestRate(double newValue){

        annualInterestRate = newValue;

    }

}
