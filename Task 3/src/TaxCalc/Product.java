package TaxCalc;

public class Product implements Taxable {

    @Override
    public double calTax() {
        return 0;
    }

    private int productId;
    private int Quantity;
    private double productPrice;

    public Product(int productId,int Quantity,double productPrice){ //parametrised constructor
        this.productId=productId;
        this.productPrice=productPrice;
        this.Quantity=Quantity;
    }
//method to calculate the sales tax of product
    public static void salesTax(int productId, int Quantity, double productPrice){
        double invoiceVal = (productPrice * Quantity);
        double productSalesTax = invoiceVal * salesTax;
        String formattedNumber = String.format("%.2f", productSalesTax); //limit the decimal value to 2
        System.out.println("Sales tax of a product id " + productId  + " of quantity " + Quantity + " is " + formattedNumber);
    }
}
