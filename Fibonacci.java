
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String [] args){
        int p1 = 0;
        int p2 = 1;
        int c = 0;
        System.out.println(0);
        System.out.println(1);
        for(int i =1; i <=10;i++){
            c = p1 + p2;
            System.out.println(c);
            p1 = p2;
            p2 = c;
        }
    }
}
