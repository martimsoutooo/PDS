

public class BankAccountImplProxy implements BankAccount{
    
    private BankAccountImpl account;

    public BankAccountImplProxy(BankAccountImpl account) {
        this.account = account;
    }
      
    private boolean checkUser() {
        if (Company.user == User.OWNER) {
            return true;
        }
        return false;
    }

    @Override
    public void deposit(double amount) {
        account.deposit(amount);
    }

    

    @Override
    public boolean withdraw(double amount) {
        if (checkUser()) {
            return account.withdraw(amount);
        }
        System.out.println("Security warning!");
        return false;
    }

    @Override
    public double balance() {
        if (checkUser()) {
            return account.balance();
        }
        System.out.println("Security warning!");
        return Double.NaN;
    }

}
