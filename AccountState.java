public interface AccountState{
    public String getState();
    public void activateState(Account account);
    public void suspendState(Account account);
    public void closeState(Account account);
    public void deposit(double balance, double depositAmount);
    public void withdraw(double balance, double withdrawAmount);
}