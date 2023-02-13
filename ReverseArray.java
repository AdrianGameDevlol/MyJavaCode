import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array [] = new int[5];
        int revArray [] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array [i] = sc.nextInt();
        }
        for (int i = array.length - 1; i >= 0 ; i--) {
            revArray [array.length - i - 1] = array [i];
        }
        for (int i = 0; i < array.length; i++){
            System.out.println( revArray [i] );
        }
    }
}