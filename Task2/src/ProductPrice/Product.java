package ProductPrice;

public class Product {
    int pid;
    double price;
    int quantity;
    String name;
//parameterised constructor with required details
    public Product(String name,int pid,double price,int quantity){
        this.name=name;
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;

    }
}
