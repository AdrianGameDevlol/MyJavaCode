import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Mathematics calculator = new Mathematics();
        Scanner sc = new Scanner(System.in);
        int ch;
        while(true){
        System.out.println("Enter 1 for Addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Division \n 5 for Prime Number \n 6 for Perfect Number \n ");
        ch = sc.nextInt();
        if(ch==1){
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            int ans = calculator.Addition(a, b);
            System.out.println("Sum is "+ans);
            
            }
            else if(ch==2){
                System.out.println("Enter the first number");
                int a = sc.nextInt();
                System.out.println("Enter the second number");
                int b = sc.nextInt();
                int ans = calculator.Subtraction(a, b);
                System.out.println("Difference is "+ans);
                
            }
            else if(ch==3){
                System.out.println("Enter the first number");
                int a = sc.nextInt();
                System.out.println("Enter the second number");
                int b = sc.nextInt();
                int ans = calculator.Multiplication(a, b);
                System.out.println("Product is "+ans);
                break;
            }
            else if(ch==4){
                System.out.println("Enter the first number");
                int a = sc.nextInt();
                System.out.println("Enter the second number");
                int b = sc.nextInt();
                int ans = calculator.Division(a, b);
                System.out.println("Quotient is "+ans);
                break;
            }
            else if(ch==5){
                System.out.println("Enter the number");
                int a = sc.nextInt();
                boolean ans = calculator.PrimeNumber(a);
                if(ans==true){
                    System.out.println("This is a prime number");
                    break;
                }
                else{
                    System.out.println("This is a composite number");
                    break;
                }
            }
            else if(ch==6){
                System.out.println("Enter the range");
                int a = sc.nextInt();
                calculator.displayPerfectNumbers(a);
            }
        }
    }
}
            
    
