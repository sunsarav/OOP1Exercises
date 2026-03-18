package se.lexicon;

public class Student {
    private final int studentId;
    private final String name;
    private int age;
    private final String major;

    //Constructors
    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        setAge(age);
        this.major = major;
    }

    //Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    //Setters

    public void setAge(int age) {
        if (age > 0 && age < 60) {
            this.age = age;
        }
    }

}
//UML Class Diagram

