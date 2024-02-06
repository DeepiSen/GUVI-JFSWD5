package DateTime;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateTime {
    public static <locale> void main(String[] args) {

        String input;

        Scanner scanner=new Scanner(System.in);

        //Getting input from user
        System.out.println("Enter Your Birth Date(yyy-mm-dd) : " );
        input = scanner.nextLine();

//Converting string to a date format
        LocalDate dob = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();//getting current date

        if(dob != null && currentDate != null){ //null check
          Period age =  Period.between(dob,currentDate); //Calculating difference between the dates

            // Extract years, months, and days from the period
            int years = age.getYears();
            int months = age.getMonths();
            int days = age.getDays();
            System.out.println("Your age is :" + years + "Years " +months + "Months "+days + "Days");
        }else{
            System.out.println("Invalid input");
        }

    }
}
