package NumPramid;

public class Main {
    public static void main(String[] args) {
        int count =5;
        for(int i = count; i>=1; i--){
            System.out.print("\n");
            for(int j =count; j>=1; j--){
                System.out.print(i>j?i:j); //using ternary operator for finding i or j greater
            }
          //  count++;
        }
    }
}
