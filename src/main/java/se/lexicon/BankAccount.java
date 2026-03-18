package se.lexicon;

public class BankAccount {
    //Encapsulation
    private String accountHolder;
    private double balance;

    //Constructors to Initialize values
    public BankAccount(String accountHolder, double balance) {
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    //Setter and Getter

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            throw new IllegalArgumentException("Accountholder cannot be null or empty");
        } else {
            this.accountHolder = accountHolder;
        }
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
        throw new IllegalArgumentException("Invalid");
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
}

