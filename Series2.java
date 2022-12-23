import java.util.*;
public class Series2{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n = sc.nextInt();
        int prod = 1;
        int ans = 0;
        /*for(int i = 1; i <=n; i++){
            System.out.println("Value of i is "+i);
            prod = 1;
            System.out.println("Value of prod is "+prod);
            for(int j = 1; j <= i;j++){
                System.out.println("Value of j is "+j);
                prod = prod*j;
                System.out.println("Value of prod is "+prod);
            }
            ans = ans+prod;
            System.out.println("Value of ans is "+ans);
        }
        System.out.println("Answer is "+ans);
    }
}*/
for(int i=1; i<=n; i++){
    prod=prod*i;
    ans=ans+prod;
    
}
System.out.println("Sum of series is "+ans);

}
}