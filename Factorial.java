public class Factorial {
    public static void main(String[] args) {
        int input, ans=1;
        input = 6;
        int i=input;
        for( ; ; ){
           /*  if(i<=1)
            {
break;
            }*/

            
            ans=ans*i;
            i--;
        }
        System.out.println("The factorial of " +input+  " is "+ans);
    }
}