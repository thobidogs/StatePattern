public class Account{

    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.accountNumber = AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(Double depositAmount){
        accountState.deposit(balance, depositAmount);
        System.out.println(toString());
    }

    public void withdraw(Double withdrawAmount){
        accountState.deposit(balance, withdrawAmount);
        System.out.println(toString());
    }

    public void suspend(){
        accountState = new SuspendedState();
        accountState.suspendState(this);
    }

    public void activate(){
        accountState.activateState(this);
    }

    public void close(){
        accountState = new ClosedState();
        accountState.closeState(this);
    }

    @Override
    public String toString(){
        return "Account Number: " + this.accountNumber
                + "\nCurrent Balance:" + this.balance;

    }

}