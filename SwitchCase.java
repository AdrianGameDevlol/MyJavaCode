import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1- to display choice 1 \n 2- to display choice 2 \n 3- to display choice 3");
        String ch = sc.nextLine();
        switch(ch){
            case "1":
            System.out.println("You have chosen choice 1");
            break;
            
            case "2":{
                System.out.println("You have chosen choice 2");
                break;
            }
            case "3":{
                System.out.println("You have chosen choice 3");
                break;
            }
            default:{
                System.out.println("Please enter a number between 1 and 3");
            }
        }
    }
}
