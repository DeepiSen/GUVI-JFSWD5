package TaxCalc;

public class Employee implements Taxable { //implements Taxable to access tax values

    @Override
    public double calTax() { //method overrides
        return 0;
    }

    private int empId;
    private static String empName;
    private static int Salary;

    private  static double empIncomeTax = 0.0;

    public Employee(int empId,String empName,int Salary){ //parameterised constructor
        this.empId = empId;
        this.empName=empName;
        this.Salary =Salary;
    }

    public static void incomeTax(int empId,String empName,int Salary) { //method to calculate incometax of employee
        empIncomeTax = Salary * incomeTax;
        System.out.println("Income tax of a " + empName + "  is  " + empIncomeTax );

    }
}
