package se.lexicon;

public class Main {
    static void main() {

        //Exercise 1 - BankAccount
        BankAccount acc1 = new BankAccount("John Doe", 155000);
        BankAccount acc2 = new BankAccount("John Smith", 255000);

        acc1.deposit(1000);
        acc1.withdraw(500);

        acc2.deposit(2200);
        acc2.withdraw(200);

        System.out.println(acc1.getAccountHolder() + " balance: " + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + " balance: " + acc2.getBalance());


        //Exercise 2 - Customer
        Customer num1 = new Customer("101","Rahul Sharma","rahul.s@example.com",
                "+91 98765 43210");
        Customer num2 = new Customer("102","Priya Singh","priya.s@example.com",
                "+91 99887 76655");


        System.out.println(num1.getName() + " - " + num1.getEmail() + " can be contacted " +
                num1.getPhoneNumber());
        System.out.println(num2.getName() + " - " + num2.getEmail() + " can be contacted " +
                num2.getPhoneNumber());

        //Exercise 3 - Student



    }
    }

