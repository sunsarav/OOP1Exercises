package se.lexicon;

public class BankAccount {
    //Encapsulation
    private String accountHolder;
    private double balance;

    //Constructors to Initialize values
    public BankAccount(String accountHolder, float balance) {
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    //Setter and Getter

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Methods
    public void deposit(double amount) {
        if (amount > 0) {
        balance += amount;
        System.out.println(amount + "Deposited");
    } else {
        throw new IllegalArgumentException("Invalid Deposit Amount");
    }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
        balance -= amount;
            System.out.println(amount + "Withdrawn");
    } else {
        throw new IllegalArgumentException("Invalid or Insufficient Balance");
        }
        }

    public String getObjectsInfo() {
        return "Name: " + accountHolder + ", Balance is: " + balance;

    }


}