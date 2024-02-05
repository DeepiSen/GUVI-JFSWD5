package WeekDayPrinting;

import java.util.Scanner;

public class WeekDays {
    private static String[] Days = {"Sunday","Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday"};

    public WeekDays(){

    }

    private static void getDay(int count){
       try{
           if(count <=6){
               for(int i =0;i<=count;i++){
                   if(count == i){
                       System.out.println("The day of Count " + count +" is " + Days[i]);
                   }
               }
           }else {
               throw new ArrayIndexOutOfBoundsException("Count is greater than 6");
           }
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Exception: " +e );
       }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day number");
        int Count = scanner.nextInt();

        getDay(Count);


    }
}

