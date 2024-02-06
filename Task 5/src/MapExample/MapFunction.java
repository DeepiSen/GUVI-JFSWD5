package MapExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFunction {
    public static void main(String args[]){

        // Create a Stream of strings
        Stream<String> names = Stream.of("aBc","d","ef");

        // Convert each string to uppercase using map()
        Stream<Object> upperCaseName =  names.map(String::toUpperCase);

        //System.out.println(upperCaseName);
        upperCaseName.forEach(System.out::println);






    }
}
