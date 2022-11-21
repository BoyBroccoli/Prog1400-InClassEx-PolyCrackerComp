package payrollSystem;

public class PieceWorker extends Employee{



    private int unitsProduced;

    // Empty Constructor
    public PieceWorker(){};

    // Constructor
    public PieceWorker(String firstName, String lastName, int unitsProduced){
        super(firstName, lastName);
        this.unitsProduced = unitsProduced;
    }


    // Getters

    public int getUnitsProduced() {
        return unitsProduced;
    }

    // Setters

    public void setUnitsProduced(int unitsProduced) {
        this.unitsProduced = unitsProduced;
    }

    @Override
    public double calculateMonthlyPay() {

        return unitsProduced * 1;
    }

}
