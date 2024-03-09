package ExceptionHandling;

import java.util.Scanner;



public class StudentManagement {

    public static void main(String[] args) throws AgeNotWithinRangeException, NameNotValidException {


        //getting input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Details");

        System.out.println("Enter Student Name");
        String name = scanner.nextLine();

        System.out.println("Enter Student Course");
        String course = scanner.nextLine();

        System.out.println("Enter Student roll number");
        int rollNum = scanner.nextInt();

        System.out.println("Enter Student age");
        int age = scanner.nextInt();

        //calling the function to check exception
        new Student(rollNum, name, age, course);
      }
}


