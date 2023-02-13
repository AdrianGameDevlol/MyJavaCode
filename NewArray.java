import java.util.Scanner;
public class NewArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = new int [5];
        int array1[] = new int [5];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            array1[i] = array[i] + 1;
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array1[i]);
        }
    }
}