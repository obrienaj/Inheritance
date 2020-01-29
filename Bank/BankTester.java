public class BankTester{
    public static void main(String[] args){

        Account[] accounts = new Account[5];
        
        SavingsAccount acc0 = new SavingsAccount(986733);
        accounts[0] = acc0;
        
        SavingsAccount acc1 = new SavingsAccount(674843);
        accounts[1] = acc1;

        CurrentAccount acc2 = new CurrentAccount(167843, 500);
        accounts[2] = acc2;
        
        CurrentAccount acc3 = new CurrentAccount(309856, 200);
        accounts[3] = acc3;
        
        CurrentAccount acc4 = new CurrentAccount(508537, 100);
        accounts[4] = acc4;

        Bank bank0 = new Bank(accounts);

    }
}