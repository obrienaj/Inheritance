public class CurrentAccount extends Account{
    
    private double overdraftlim;

    public CurrentAccount(int a, double o){
        super(a);
        accnum = a;
        bal = 0.0;
        overdraftlim = o;
    }

    public void notifyOverdraft(){
        if (bal < 0){
            System.out.println("Account #" + accnum 
            + " has an overdraft balance of $" + Math.abs(bal));
        }
    }


}