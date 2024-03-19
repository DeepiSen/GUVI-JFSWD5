package TaxCalc;

public interface Taxable {
    float salesTax = (float) 7 /100;
    double incomeTax = 10.5/100;

    public abstract double calTax();//abstract method


}
