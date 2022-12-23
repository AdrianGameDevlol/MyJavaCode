import java.util.*;
//1^2/a + 3^2/a^2....
class OddNumberPower{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        double ans=0;
        int n=1;
        
        for(int i=1; i<=10; i=i+2,n= n+1){
            ans=ans+Math.pow(i,2)/Math.pow(a,n);
            
        }
        System.out.println("Sum of series is"+ans);
    }
}