package payrollSystem;

public abstract class Employee {

    private String firstName;
    private String lastName;

    // Constructor
    Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Empty Constructor
    Employee(){};
    public abstract double calculateMonthlyPay();

    // Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "Name: " + getFirstName() + " " + getLastName()
                + "\n Pay Type: " + super.getClass().getSimpleName() +
                "\n Monthly Pay: $" + String.format("%.2f", calculateMonthlyPay());
    }
}
