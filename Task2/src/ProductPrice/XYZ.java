package ProductPrice;

import java.util.Scanner;
public class XYZ extends Product{ //extends product class
    public XYZ(String name, int pid, double price, int quantity) { //default constructor
        super(name, pid, price, quantity);
    }
//calculating total amount spent on all products
    public static double calculateTotalAmount(Product[] products){
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }

    public static void main(String[] args)  { //main function
        Product[] products = new Product[5]; //creatinf an array to store product detais

        // Accept product information from the user
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter product details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Product Price: ");
            double price = scanner.nextDouble();
            System.out.print("Product Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(name, pid, price, quantity);
        }


    //PID of highest value product

    int highestPricePid = 0;
    double maxPrice = 0;

    for(int i= 0;i<products.length;i++){
        if(products[i].price>maxPrice){
            maxPrice = products[i].price;
            highestPricePid = products[i].pid;
        }
    }
        System.out.println("PID of highest priced products is " +highestPricePid);//result of pid of highest price product

        double totalAmountSpent = calculateTotalAmount(products); //Method calling for calculation
        System.out.println("Total amount spent on all products " +totalAmountSpent); //Total amount spent on all 5 products
}



}
