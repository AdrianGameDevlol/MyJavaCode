public class Office {
    public static void main(String[] args) {
        Employee adrian = new Employee();
        adrian.setID("Adrian");
        adrian.setPosition("CEO");
        adrian.setSalary(10000000);
        adrian.displayEmployeeDtls();
        Employee deepanshu = new Employee();
        deepanshu.setID("Deepanshu");
        deepanshu.setPosition("CFO");
        deepanshu.setSalary(1000000);
        deepanshu.displayEmployeeDtls();
        
    }
}
