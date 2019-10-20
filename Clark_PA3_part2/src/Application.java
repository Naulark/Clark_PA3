public class Application {

    public static void main(String[] args){

        int i;

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.annualInterestRate = 0.04;
        //Calling method syntax
        syntax();

        for(i = 0; i < 12; i++){

            saver1.calculateMonthlyInterest();
            System.out.printf("   Month #%d:\t$%.2f",i+1,saver1.getSavingsBalance());
            saver2.calculateMonthlyInterest();
            System.out.printf("   \t$%.2f",saver2.getSavingsBalance());
            System.out.println();

        }

        //Calling method closingRemarks
        closingRemarks();
        //After closing syntax print new IR values
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\t\t\t\tSaver 1\t\tSaver 2");
        System.out.printf(" New Balances:  $%.2f \t$%.2f",saver1.getSavingsBalance(), saver2.getSavingsBalance());

    }

    public static void syntax(){

        System.out.println("\t\t\t\tSaver 1\t\tSaver 2");
        System.out.println("Base amount:\t$2000.00\t$3000.00");

    }

    public static void closingRemarks(){

        System.out.println("----------------------------------------");
        System.out.println("After changing the interest rate to 5%:");
        SavingsAccount.modifyInterestRate(0.05);

    }

}