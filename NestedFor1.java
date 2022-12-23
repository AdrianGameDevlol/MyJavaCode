import java.util.*;
class NestedFor1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 1;
        while(i<= n){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = n-1;
        while(i>= 1){
            for(int j = i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}