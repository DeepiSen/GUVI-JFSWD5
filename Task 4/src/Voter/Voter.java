package Voter;


import java.util.Scanner;

public class Voter {

    private static int age;
    private static String name;
    private static int voterId;

    class AgeNotWithinRangeException extends Exception { //custom exception for age checking
        public AgeNotWithinRangeException(String message) {

            super(message);
        }
    }

//parameterised constructor to initialise the attributes
    public Voter(int age,int voterId,String name) throws AgeNotWithinRangeException {

        System.out.println("Voter details are :" + "\n");
        System.out.println("Voter name is " + name);
        System.out.println("Voter age is " + age);
        System.out.println("Voter-id is " +voterId);


           if(age<18 ){
                //System.out.println("age is valid");
                throw new AgeNotWithinRangeException("Age is not valid for voter");
            }

           this.age=age;
           this.name=name;
           this.voterId=voterId;
    }


    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        try{ //exception handling for invalid age of voter
            Voter voter = new Voter(10,1235,"Senthil");
            System.out.println("Voter is accepted");
        }catch(AgeNotWithinRangeException e){
            System.out.println("Invalid age for voter");
        }

    }
}
