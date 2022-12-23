import java.util.*;
public class FibonacciAlt{
    public static void main(){
        int p1=0;
        int p2=1;
        int x=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        for(int i= 1; i<=n; i++){
             x=p1+p2;
             p1= p2;
             p2= x;
             System.out.println(x);
        }
    }
}