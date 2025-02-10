public class ActiveState implements AccountState{
  
    public String getState(){
        return "active";
    }

    public void closeState(Account account){
        account.setAccountState(new ClosedState());
        System.out.println("Acount is closed!");
    }

    public void suspendState(Account account){
        account.setAccountState(new SuspendedState());
        System.out.println("Acount is suspended!");
    }

    public void activateState(Account account){
        System.out.println("Acount is already activated!");
    }

    public void deposit(double balance, double depositAmount){
        balance = balance + depositAmount;
        
    }

    public void withdraw(double balance, double withdrawAmount){
        balance = balance - withdrawAmount;
    }
}