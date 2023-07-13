class BankAccount {
    static String accountNumber ;
    static String accountHolderName ;
    static double balance ;
    static String accountType ;
    static boolean isActive ;

    public static void main(String[] args) {
		
		String accountNumber = "1234567890";
     String accountHolderName = "John Doe";
     double balance = 5000.0;
     String accountType = "Savings";
     boolean isActive = true;
		
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Is Active: " + isActive);
    }
}
