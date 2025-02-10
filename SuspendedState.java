public class SuspendedState implements AccountState{
    
    public String getState(){
        return "suspended";
    }

    public void closeState(Account account){
        account.setAccountState(new ClosedState());
        System.out.println("Acount is closed!");
    }

    public void suspendState(Account account){
        System.out.println("Acount is already suspended!");
    }

    public void activateState(Account account){
        account.setAccountState(new ActiveState());
        System.out.println("Acount is activated!");
    }

    public void deposit(double balance, double depositAmount){
        System.out.println("You cannot deposit on suspended account!");
    }

    public void withdraw(double balance, double withdrawAmount){
        System.out.println("You cannot withdraw on suspended account!");
    }
}