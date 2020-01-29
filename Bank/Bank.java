public class Bank{

    private Account[] accounts = new Account[5];

    public Bank(Account[] a){
        accounts = a;
    }

    public void update(){

        SavingsAccount sa;
        CurrentAccount ca;

        for(Account acc : accounts){
            if (acc instanceof SavingsAccount){
                sa = (SavingsAccount) acc;
                sa.addInterest(acc.getBalance());
            }
            if (acc instanceof CurrentAccount){
                ca = (CurrentAccount) acc;
                ca.notifyOverdraft();
            }
        }
    }
    public void payDividend(double sum){
        for (Account acc : accounts){
            acc.deposit(sum);
        }
    }
    public void openAccount(){

    }
    public void closeAccount(){

    }
}