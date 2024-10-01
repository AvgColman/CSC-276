public class Bank {
    public static void main(String[] args) {
        //bank accs
        BankAccount acc1 = new BankAccount(1000, 100, 2);
        BankAccount acc2 = new BankAccount(1500, 200, 2);
        //conversion
        double swissToUS = BankAccount.convertCur(150, 1.08);
        double euroToUS = BankAccount.convertCur(140, 1.10);
        //add/sub bal
        acc1.updateBalance(300);
        acc2.updateBalance(-400);
        //print acc bal
        System.out.println("Account:");
        acc1.displayAccount();
        acc2.displayAccount();
        //update acc conversion
        acc1.updateBalance(swissToUS);
        acc2.updateBalance(euroToUS);
        //print conversion
        System.out.println("\nAccount after conversion:");
        acc1.displayAccount();
        acc2.displayAccount();
    }
}
