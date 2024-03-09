package StudentGift;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {

        //input list of students name
        List<String> studentNameList = Arrays.asList("Anubu","Adhil","Banu","Akasah","Peter","John","Anu");

        //sorting out student name start with A using lambda function
        List<String> specificStudents =

        studentNameList.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());

        System.out.println("Students name Starts with A " + specificStudents);
    }
}
