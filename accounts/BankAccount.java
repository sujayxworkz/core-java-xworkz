package accounts;
public class BankAccount {

    private double balance;

    public BankAccount(){

    }

    public void credit(double amount){
        if(amount>0)
            this.balance=balance+amount;
        else{
            System.out.println("the amount should not be less than 0 ");
        }

    }
    public void debit(double amount){
        if(amount<=balance)
            this.balance=balance-amount;
        else{
            System.out.println("the insufficent balance....... ");
        }
    }

    public void transfer(double amount, BankAccount  ReceiverAccount){

        ReceiverAccount.credit(amount);
        this.debit(amount);

    }
    public void toTransfer(double amount,BankAccount receiverAccount){
        receiverAccount.credit(amount);
        this.debit(amount);
    }
    public void fortransfer(double amount,BankAccount getterAccount){
        getterAccount.credit(amount);
        this.debit(amount);
    }
    public double getBalance(){
        return balance;
    }
}
