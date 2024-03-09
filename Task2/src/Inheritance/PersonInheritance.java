package Inheritance;

public class PersonInheritance {
    private String name;
    private int age;

    // Constructor for Person class
    public PersonInheritance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for Person class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends PersonInheritance {
    private int employeeId;
    private double salary;

    // Constructor for Employee class using super keyword
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age); // Call the constructor of the superclass (PersonInheritance)
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters for Employee class
    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}

