package PurchasePayable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Payable;
        float Discount;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the Purchase Value");//getting purchase value as input
        int PurchaseValue = object.nextInt();
//ifclause to find the purchase value range and put discount accordingly
        if(PurchaseValue < 500){ //purchase value less than 500 no discount
            System.out.println("No Discount and Payable will be  " + (Payable = PurchaseValue));
        }
        else if(PurchaseValue >= 500 && PurchaseValue < 1000){ //purchase value between 500 and 1000 10% discount
            Discount = (float) 10 /100;
            Payable = (int) (PurchaseValue-((PurchaseValue)*Discount));
           // System.out.println("Discount is "+ Discount);
          //  System.out.println("Payable is "+Payable);
            System.out.println("10% Discount and Payable will be  " + Payable);
        }
        else if(PurchaseValue >= 1000){ //purchase value greater than 1000 20% discount
            Discount = (float) 20 /100;
            Payable = (int) (PurchaseValue-((PurchaseValue)*Discount));
            System.out.println("20% Discount and Payable will be  " + Payable);
        }


    }
}
