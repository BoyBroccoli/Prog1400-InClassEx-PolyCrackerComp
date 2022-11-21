package payrollSystem;

public class Manager extends Employee{



    private double monthlyBonusAmount;

    // Empty Constructor
    public Manager(){};

    // Constructor
    public Manager(String firstName, String lastName, double monBonAmount){
        super(firstName, lastName);
        this.monthlyBonusAmount = monBonAmount;
    }


    // Getters

    public double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    // Setters

    public void setMonthlyBonusAmount(double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }


    @Override
    public double calculateMonthlyPay() {

        return  (100000 + monthlyBonusAmount)/12;
    }
}
