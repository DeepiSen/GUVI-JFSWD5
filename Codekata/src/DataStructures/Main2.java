package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();

        while(input.size() <=6 ){ //getting input from user

            int value = scanner.nextInt();
          /*  if(input.size() == 6){
                System.out.println("inside if");
                break;
            }*/
            input.add(value);
        }

        for(int element : input){
            System.out.print(element);
            System.out.print(" ");

        }
    }
}
