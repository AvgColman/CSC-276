import java.util.Scanner;
//public class
public class Bank {
    public static void main(String[] args) {
        Scanner bankAcc = new Scanner(System.in); //scanner
        //start of asking for Checking info
        System.out.println("Enter the balance for the Checking:");
        double checkingBal = bankAcc.nextDouble();
        System.out.println("Enter the interest(%) for the Checking:");
        double checkingInt = bankAcc.nextDouble();
        System.out.println("Enter years for the Checking:");
        int checkingYears = bankAcc.nextInt();
        //start of asking for Savings info
        System.out.println("Enter the balance for the Savings:");
        double savingsBal = bankAcc.nextDouble();
        System.out.println("Enter the interest(%) for the Savings:");
        double savingsInt = bankAcc.nextDouble();
        System.out.println("Enter years for the Savings:");
        int SavingYrs = bankAcc.nextInt();
        //int rate calc
        double savingsInterest = (savingsBal * savingsInt * SavingYrs) / 100;
        double checkingInterest = (checkingBal * checkingInt * checkingYears) / 100;
        //output of info
        System.out.println("Chase Bank:");
        System.out.printf("Checking Bal: $%.2f. Interest: $%.2f\n", checkingBal, checkingInterest);
        System.out.printf("Savings Bal: $%.2f. Interest: $%.2f\n", savingsBal, savingsInterest);

        bankAcc.close();
    }
}

