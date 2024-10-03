public class BankAccountImplProxy2 implements BankAccount2{
    
    private BankAccountImpl2 account;

    public BankAccountImplProxy2(BankAccountImpl2 account) {
        this.account = account;
    }
      
    private boolean checkUser() {
        if (Company2.user == User2.OWNER2) {
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
