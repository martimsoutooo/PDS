public class BankAccountImplProxy3 implements BankAccount3{
    
    private BankAccountImpl3 account;

    public BankAccountImplProxy3(BankAccountImpl3 account) {
        this.account = account;
    }
      
    private boolean checkUser() {
        if (Company3.user == User3.OWNER3) {
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
