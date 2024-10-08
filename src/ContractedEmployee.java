public class ContractedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    protected String federalTaxId;
    protected double numberOfHoursWorked;

    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        // TODO fill in code here
        this.employeeId = employeeId;
        this.name = name;
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        // TODO fill in code here and replace the return statement
        return "";
    }

    public void setFederalTaxId(String federalTaxId) {
        // TODO fill in code here
        this.federalTaxId = federalTaxId;
    }

    public double getHourlyRate() {
        // TODO fill in code here and replace the return statement
        return 0;
    }

    public void setHourlyRate(double hourlyRate) {
        // TODO fill in code here
    }

    public double getNumberOfHoursWorked() {
        // TODO fill in code here and replace the return statement
        return 0;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        // TODO fill in code here
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    // TODO fill in code here
}