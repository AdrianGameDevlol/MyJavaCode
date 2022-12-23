import java.util.*;
public class PROG14
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Area of circle \n 2- Square \n 3- Rectangle");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter radius");
                double r=sc.nextDouble();
                double area=Math.PI*r*r;
                System.out.println("Area of circle="+area);
                break;
                case 2:
                    System.out.println("Enter side");
                    int side=sc.nextInt();
                    int balls=side*side;
                    System.out.println("Area of square="+balls);
                    break;
                    case 3:
                        System.out.println("Enter l & b");
                        int l=sc.nextInt();
                        int b=sc.nextInt();
                        int funi=l*b;
                        System.out.println("Area of rectangle="+funi);
                        break;
                        default:
                            System.out.println("RIP Bozo");
                    
        }
    
}

}