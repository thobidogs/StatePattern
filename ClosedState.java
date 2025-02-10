public class ClosedState implements AccountState{

    public String getState(){
        return "closed";
    }

    public void closeState(Account account){
        System.out.println("Acount is already closed!");
    }

    public void suspendState(Account account){
        account.setAccountState(new SuspendedState());
        System.out.println("You cannot suspend a closed account!");
    }

    public void activateState(Account account){
        System.out.println("You cannot activate a closed account!");
    }

    public void deposit(double balance, double depositAmount){
        System.out.println("You cannot deposit on closed account!");
    }

    public void withdraw(double balance, double withdrawAmount){
        System.out.println("You cannot withdraw on closed account!");
    }
}