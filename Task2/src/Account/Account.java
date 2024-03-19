package Account;

public class Account {
    double Balance;
    double accountNumber = 0;
    public  Account() { //no argument constructor
        double accountNumber = 1234567;
    }
//two argument constructor
    public  Account(double InitialBalance, double accountNumber){

        Balance=InitialBalance;
        System.out.println("Initial Balance is "+Balance);

    }

    //method to deposit amount

    public void depositAmount(int amount){
        if(amount>0) {
            Balance =Balance + amount;
            System.out.println("total balance after deposited amount is "+Balance);
        }else{
            System.out.println("Invalid amount");
        }
    }
    //method to withdraw the amount
    public void withdrawAmount(int amount){
        if(amount>0 && amount <= Balance){
            Balance -=amount;
            System.out.println("total balance after withdrawn the amount is "+Balance);
        }else {
            System.out.println("Insufficient funds in account");
        }
    }
    //method to display the balance

    public void display(){
        System.out.println("Current Balance is " +Balance );
    }

}
