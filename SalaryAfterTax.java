import java.util.Scanner;
class SalaryAfterTax{
    private long sal;
    double nextSal;
    public void acceptSal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        sal = sc.nextLong();
    }
    public void calculateSalAfterTax(long sal, double nextSal){
        if(sal<=50000){
            nextSal = sal;
        }
        else if(sal>=50001 && sal<=100000){
            nextSal = 0.1 * sal;
        }
        else if(sal>=100001 && sal<=200000){
            nextSal = 0.2 * sal;
        }
        else{
            nextSal = 0.3 * sal;
        }
    }
    public static void main(){
        SalaryAfterTax acceptSal = new SalaryAfterTax();
        SalaryAfterTax calculateSalAfterTax = new SalaryAfterTax();
        
    }
}