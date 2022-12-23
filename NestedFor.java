import java.util.*;
public class NestedFor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }
            for(int k = i-1; k >=1; k--){
                System.out.print(k);
            }
            System.out.println();
            i++;
        }
    }
}