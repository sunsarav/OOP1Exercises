package se.lexicon;

public class Main {
    static void main() {

        //Exercise 1 - BankAccount
        System.out.println("===BANKACCOUNT===");
        BankAccount acc1 = new BankAccount("John Doe", 155000);
        BankAccount acc2 = new BankAccount("John Smith", 255000);

        acc1.deposit(1000);
        acc1.withdraw(500);

        acc2.deposit(2200);
        acc2.withdraw(200);

        System.out.println(acc1.getAccountHolder() + " balance: " + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + " balance: " + acc2.getBalance());
        System.out.println();


        //Exercise 2 - Customer
        System.out.println("===CUSTOMER===");
        Customer num1 = new Customer("101","Rahul Sharma","rahul.s@example.com",
                "+91 98765 43210");
        Customer num2 = new Customer("102","Priya Singh","priya.s@example.com",
                "+91 99887 76655");


        System.out.println(num1.getName() + " - " + num1.getEmail() + " can be contacted " +
                num1.getPhoneNumber());
        System.out.println(num2.getName() + " - " + num2.getEmail() + " can be contacted " +
                num2.getPhoneNumber());
        System.out.println();

        //Exercise 3 - Student
        System.out.println("===STUDENT===");

        Student s1 =new Student(1,"Alice Johnson",29,"Science");
        Student s2 =new Student(2,"Robert Brown ",35,"Computer");
        Student s3 =new Student(3,"Sarah White",27,"Accounts");

        System.out.println(s1.getName() + "Age: " + s1.getAge() + "In Major: " + s1.getMajor());
        System.out.println("StudentId: " + s2.getStudentId() + " | And Name is: " + s2.getName());
        System.out.println(s3.getName() + "Age is: " + s3.getAge());
        System.out.println();

        //Exercise - 4 Product
        System.out.println("===PRODUCT===");

        Product p1 = new Product(1001,"Sunscreen",160);
        Product p2 = new Product(1007,"Swimsuit",300);
        Product p3 = new Product(1010,"SunHat",260);
        System.out.println(" Product Id: " + p1.getProductId() + " priced " + p1.getPrice() +
                " refers to " + p1.getName());
        System.out.println(p2.getName() + " costs: " + p2.getPrice());
        System.out.println(p3.getName() + " Id number is: " +p3.getProductId());
        System.out.println();

        //Exercise - 5 Order
        System.out.println("===ORDER===");


    }
    }

