import java.util.*;
public class COMPINTEREST
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal, rate and time");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        double ci=p*(Math.pow((1+r/100),t))-p;
        System.out.println("Compound interest is ="+ci);
        
    }
}