package se.lexicon;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(String customerId, String name, String email, String phoneNumber) {
        setCustomerId(customerId);
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public String getCustomerId() {

        return customerId;
    }

    public void setCustomerId(String customerId) {

        this.customerId = customerId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getObjectsInfo() {
        return "CustomerId: " + customerId + ", Name: " + name + ", Email: " + email + ", " +
                "PhoneNumber: " + phoneNumber;
    }
}
