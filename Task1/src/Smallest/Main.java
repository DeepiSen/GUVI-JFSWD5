package Smallest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Getting three inputs from user
            Scanner object = new Scanner(System.in);
            System.out.println("Enter first number");
            int x = object.nextInt();
            System.out.println("Enter second number");
            int y = object.nextInt();
            System.out.println("Enter third number");
            int z = object.nextInt();

          //  System.out.println("Three numbers are " + x   + y   + z);
//using conditional clause to find the smallest number
        if(x<y && x<z){ //check for x is smallest
            System.out.println("x is smallest");
        } else if (y<x && y<z) { //check for y is smallest
            System.out.println("y is smallest");
        }
         else {//defaultly z is smallest
            System.out.println("z is smallest");
        }


    }
}
