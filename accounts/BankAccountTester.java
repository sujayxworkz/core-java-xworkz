package accounts;

public class BankAccountTester {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BankAccount account = new SavingsAccount();
        account.credit(1000);
        System.out.println("the amount credited is"+account.getBalance());

        BankAccount frndsAccount=new SavingsAccount();
        account.transfer(800,frndsAccount);
        System.out.println("The balance is "+account.getBalance());

        System.out.println("The balance in frnds account"+frndsAccount.getBalance());

        BankAccount broAccount = new CurrentAccount();
        broAccount.credit(2000);
        System.out.println("The current balance is"+broAccount.getBalance());

        BankAccount sisAccount = new CurrentAccount();
        broAccount.toTransfer(1,sisAccount);
        System.out.println("The sister balance is"+sisAccount.getBalance());

        System.out.println("The present brother's balance is"+broAccount.getBalance());

        BankAccount fatherAccount = new CurrentAccount();
        fatherAccount.credit(500);
        System.out.println("The fathers credited amount is.."+fatherAccount.getBalance());

        BankAccount sonAccount = new CurrentAccount();
        fatherAccount.fortransfer(200,sonAccount);
        System.out.println("The sons amount is..."+sonAccount.getBalance());

        System.out.println("The fathers current amount is.."+fatherAccount.getBalance());




    }
}