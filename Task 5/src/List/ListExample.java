package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> listStrings = Arrays.asList("abc","","bc","efg","abcd","","jkl"); //input list with null values

        List<String> emptyStringList = new ArrayList<>(); // new list to store values without null
        int count = 0;
        for(String item : listStrings){ //for each loop for iterating over the list
            if(item.isEmpty()){
                System.out.println("String is null");
                count++;
            }
            else{
                emptyStringList.add(item); //adding values without null
            }
        }
        System.out.println("Total Null values are "+count);
        System.out.println("List without null value " +emptyStringList);

    }
}
