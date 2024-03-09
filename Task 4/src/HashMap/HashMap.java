package HashMap;

import java.util.Map;
import java.util.Scanner;

public class HashMap {

    static Map<String, Integer> StudentDetails = new java.util.HashMap<>();

    public static void add(){
        //adding data into map
        StudentDetails.put("John",70);
        StudentDetails.put("Peter",90);
        StudentDetails.put("Alya",30);
        StudentDetails.put("Anbu",40);
    }

    public static void display(){
        //Display the Hashmap
        System.out.println("Student ledger details : " + "\n"  + StudentDetails);
    }

    public static void remove(String RemoveKey){
        //remove data from Hashmap

        StudentDetails.remove(RemoveKey);
        System.out.println(" Student name " +  RemoveKey + " removed successfully");

    }


    public static void main(String[] args) {

//method calls
        add();
        display();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student name to be removed: "); //getting input from user
        String RemoveKey= scanner.nextLine();

        remove(RemoveKey);
        //Display the updated Hashmap
        System.out.println("after removed certain students details : ");
        display();

    }
}
