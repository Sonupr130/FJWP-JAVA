package operators;

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    //Parameterized Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter methods
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(int amount) {
        balance += amount;
    }

    // Method to withdraw money
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("Sumit Kumar", 123456, 10000);

        // Withdraw and deposit money
        account.withdraw(1100);
        account.deposit(5000);

        // Get the balance
        int currentBalance = account.getBalance();

        // Check the status
        String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";

        // Display the status
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Status: " + status);
    }
}
// OUTPUT
/*
Account Holder: Sumit Kumar
Account Number: 123456
Current Balance: 13900
Status: Minimum Balance Maintained
*/

