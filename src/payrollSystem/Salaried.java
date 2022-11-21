package payrollSystem;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Salaried extends Employee{

    private int yearsOfService;

    // Empty Constructor
    public Salaried(){};

    // Constructor
    public Salaried(String firstName, String lastName, int yearsOfService){
        super(firstName, lastName);
        this.yearsOfService = yearsOfService;
    }



    // Getters

    public int getYearsOfService() {
        return yearsOfService;
    }

    // Setters

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }



    @Override
    public double calculateMonthlyPay() {
        return (50000 * yearsOfService + .01)/12;
    }
}
