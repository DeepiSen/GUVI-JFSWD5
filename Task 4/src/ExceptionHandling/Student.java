package ExceptionHandling;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for name not valid
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}


public class Student {
    private int rollNum;
    private String studentName;
    private static int age;
    private String course;

//method to check the exception
        public Student(int rollNum, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
           try{
               if (!isValidName(name)) {
                   throw new NameNotValidException("in name of " +name);
               }
           }catch (NameNotValidException e){
               System.out.println("Exception: " + e);
            }

            try {
                if (age <= 15 || age >= 21) {
                    throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
                }
            }catch(AgeNotWithinRangeException e){
                System.out.println("Exception: " + e);
            }



        this.age=age;
        this.course=course;
        this.studentName=studentName;
        this.rollNum=rollNum;

    }

    private boolean isValidName(String name) {
        // Regular expression to check for special characters or numbers in the name
        String regex = "^[a-zA-Z]+$";
        return name.matches(regex);
    }
}
