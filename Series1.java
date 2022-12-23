import java.util.*;
public class Series1{
    public static void main(){
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        double sum=0;
        for(int i=0;i<=10;i++){
            if(i%2==0){
                sum=sum+Math.pow(a,i);

                
            }
            else{
                sum=sum-Math.pow(a,i);
                
                
            }
        }
        System.out.println("Sum of series is "+sum);
    }
}