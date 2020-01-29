public class SavingsAccount extends Account{
    
    public SavingsAccount(int a){
        super(a);
        accnum = a;
        bal = 0.0;
    }

    public void addInterest(double p){
        if (p > 0)
            bal += p * .02;
        else
            System.err.println("SavingsAccount.addInterest(...): "
            +"cannot deposit negative amount.");
    }
}