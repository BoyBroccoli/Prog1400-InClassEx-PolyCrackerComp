package payrollSystem;

public class Commissioned extends Employee{

    private double grossSales;

    // Empty Constructor
    public Commissioned(){};

    // Constructor
    public Commissioned(String firstName, String lastName, double grossSales){
        super(firstName, lastName);
        this.grossSales = grossSales;
    }


    // Getters
    public double getGrossSales() {
        return grossSales;
    }


    // Setters
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double calculateMonthlyPay() {

        return  2000 + (grossSales * .10);
    }

}
