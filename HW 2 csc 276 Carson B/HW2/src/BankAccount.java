public class BankAccount {
    //variables
    public double interest;
    public double bankBalance;
    public int accountNum;
    public int duration;
    public static final double INTEREST_RATE = 0.03;

    public BankAccount(double bankBalance, int accountNum, int duration) {
        //constructer
        this.accountNum = accountNum;
        this.bankBalance = bankBalance;
        this.duration = duration;
        this.interest = INTEREST_RATE;
    }

    public double calcInterest() {
        //calc interest
        return bankBalance * interest * duration;
    }

    public void updateBalance(double amount) {
        //bal add
        bankBalance += amount;
    }

    public static double convertCur(double fAmount, double fEx) {
        //conversion
        return fAmount * fEx;
    }

    public void displayAccount() {
        //print
        System.out.println("Account: " + accountNum);
        System.out.println("Current Bal in $: " + bankBalance);
        System.out.println("Interest in " + duration + " years ($): " + calcInterest());
        System.out.println("Interest Rate: " + interest * 100 + "%");
    }
}


