import java.util.*;
public class SCANNER
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mass and velocity");
        int m=sc.nextInt();
        int v=sc.nextInt();
        int p=m*v;
        System.out.println("Linear momentum is="+p);
    }
}
        
        
        
        