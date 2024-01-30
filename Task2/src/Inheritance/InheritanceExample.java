package Inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee("John Doe", 30, 101, 50000.0);

        // Accessing attributes using getters
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Age: " + employee1.getAge());
        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Salary: $" + employee1.getSalary());
    }
}
