package PositiveNegativeNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = object.nextInt(); // getting input from user
        if(number >= 0) //Checking whether number is greater than zero or not
        {
            System.out.println("The Number is Positive");
        }
            else
        {
            System.out.println("The Number is Negavtive");
        }


    }
}
