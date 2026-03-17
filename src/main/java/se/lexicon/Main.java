package se.lexicon;

public class Main {
    static void main() {
        //Exercise 1
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

        //Exercise 2
        Customer num1 = new Customer("101","Rahul Sharma","rahul.s@example.com",
                "+91 98765 43210");
        Customer num2 = new Customer("102","Priya Singh","priya.s@example.com",
                "+91 99887 76655");
        Customer num3 = new Customer("103","Anil Kumar","anil.k@example.com",
                "++91 90000 11111");
        Customer num4 = new Customer("104","Sarah Johnson","s.johnson@example.com",
                "+1 217-555-0192");
        Customer num5 = new Customer("105","David Lee","dlee88@example.com",
                "+1 503-555-0147");

        System.out.println(num1.getObjectsInfo());
        System.out.println(num2.getObjectsInfo());
        System.out.println(num3.getObjectsInfo());
        System.out.println(num4.getObjectsInfo());
        System.out.println(num5.getObjectsInfo());
    }
    }

