public class Employee {
    private String employeeID;
    private long employeeSalary;
    private String position;
    public void setSalary(long salary){
        employeeSalary = salary;
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public long getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public String getPosition() {
        return position;
    }
    public void setID(String ID){
        employeeID = ID;

    }
    public void setPosition(String designation){
        position = designation;
    }
    public void displayEmployeeDtls(){
        System.out.println("Employee "+employeeID+" of position "+position+" has a salary of "+employeeSalary);

    }
}
