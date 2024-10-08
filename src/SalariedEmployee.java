public class SalariedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    protected String socialSecurityNumber;
    protected double fixedMonthlyPayment;


    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        // TODO fill in code here
        this.employeeId = employeeId;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    public String getSocialSecurityNumber() {
        // TODO fill in code here and replace the return statement
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        // TODO fill in code here
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        // TODO fill in code here and replace the return statement
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        // TODO fill in code here
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    // TODO fill in code here
}