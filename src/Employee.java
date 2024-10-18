public class Employee implements Payable {
    // TODO fix class declaration and declare variables here
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        // TODO fill in code here
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        // TODO fill in code here and replace the return statement
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        // TODO fill in code here and replace the return statement
        return name;
    }

    public void setName(String name) {
        // TODO fill in code here
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return calculatePay();
    }

    public double calculatePay() {
        // TODO fill in code here and replace the return statement
        return 0;
    }

    @Override
    public String toString() {
        // TODO fill in code here and replace the return statement, be sure to format double value
        return "Employee ID: " + employeeId + ", Name: " + name + "," +
                " Average Monthly Pay: $" + String.format("%.2f", calculatePay());
    }
}