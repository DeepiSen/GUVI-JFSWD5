package TaxCalc;

public interface Taxable {
    double salesTax = 7/100;
    double incomeTax = 10.5/100;

    public abstract double calTax();


}
