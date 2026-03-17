package se.lexicon;

public class BankAccountObjects {
    private String accountNumber;
    private double balance;

    public BankAccountObjects(String name, double balance) {
        this.balance = balance;
    }

    static void main() {

        BankAccount acc1 = new BankAccount("John Doe", 155000);
        BankAccount acc2 = new BankAccount("John Smith", 255000);
        BankAccount acc3 = new BankAccount("Alice Johnson", 125000);
        BankAccount acc4 = new BankAccount("Robert Brown ", 40000);
        BankAccount acc5 = new BankAccount("Sarah White", 709000);

        System.out.println(acc1.getObjectsInfo());
        System.out.println(acc2.getObjectsInfo());
        System.out.println(acc3.getObjectsInfo());
        System.out.println(acc4.getObjectsInfo());
        System.out.println(acc5.getObjectsInfo());

    }


}






