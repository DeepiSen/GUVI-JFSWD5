package Stack;
import java.util.Stack;
public class StackExample {

    public static  void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(14);
        stack.push(12);
        stack.push(35);

        System.out.println("Stack Elements are : "+stack);


        // Pop elements from the stack
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("After removed 2 items remaining Elements are : "+stack);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
