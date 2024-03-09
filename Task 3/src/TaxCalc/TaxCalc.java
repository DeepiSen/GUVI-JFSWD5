package TaxCalc;

import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {

        //getting input from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee details");

        System.out.println("Enter Employee name");
        String empName = scanner.nextLine();

        System.out.println("Enter Employee id");
        int empId = scanner.nextInt();

        System.out.println("Enter Employee Salary");
        int Salary = scanner.nextInt();
//method calling for incometax calculation
        Employee.incomeTax(empId,empName,Salary);

        System.out.println("Enter Product details");

        System.out.println("Enter Product ID");
        int productId = scanner.nextInt();

        System.out.println("Enter Quantity of products");
        int Quantity = scanner.nextInt();

        System.out.println("Enter Price of Product");
        int Price = scanner.nextInt();

        //method calling for calculating sales tax of product
        Product.salesTax(productId,Quantity,Price);
    }
}
