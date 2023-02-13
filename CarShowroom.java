import java.util.Scanner;
public class CarShowroom{
    Car suvManual;
    Car suvAuto;
    Car famManual;
    Car famAuto;
    public CarShowroom(){
        suvManual = new Car("SUV", "White", "Manual", 100000);
        suvAuto = new Car("SUV", "Black", "Automatic", 120000);
        famManual = new Car("Family", "White", "Manual", 70000);
        famAuto = new Car("Family", "Black", "Automatic", 90000);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c, ch, cho;
        long bill = 0;
        CarShowroom showroom = new CarShowroom();
        while(true){
            System.out.println("Welcome to the Car Showroom! This is a list of cars you can purchase here: ");
            showroom.displayCarList();
            System.out.println("Enter 1 to buy an SUV \n Enter 2 to buy a Family Car \n Enter 3 to exit the showroom and display the final bill.");
            c = sc.nextInt();
            switch(c){
                case 1:{
                    System.out.println("Please choose the transmission type of your SUV.");
                    System.out.println("Enter 1 to purchase a manual SUV \n Enter 2 to purchase an automatic SUV.");
                    ch = sc.nextInt();
                    switch(ch){
                        case 1:{
                            bill = bill + showroom.suvManual.getCost();
                            System.out.println("Your current bill is "+bill);
                        }
                        break;
                        case 2:{
                            bill = bill + showroom.suvAuto.getCost();
                            System.out.println("Your current bill is "+bill);
                        }
                        break;
                    }
                }
                break;
                case 2:{
                    System.out.println("Please choose the transmission type of your Family Car.");
                    System.out.println("Enter 1 to purchase a manual family car \n Enter 2 to purchase an automatic family car.");
                    cho = sc.nextInt();
                    switch(cho){
                        case 1:{
                            bill = bill + showroom.famManual.getCost();
                            System.out.println("Your current bill is "+bill);
                        }
                        break;
                        case 2:{
                            bill = bill + showroom.famAuto.getCost();
                            System.out.println("Your current bill is "+bill);
                        }
                        break;
                    }
                }
                break;
                case 3:{
                    if (bill == 0){
                        System.out.println("We apologise the cars in the selection did not suit you. Please visit again.");
                    }
                    else{
                        System.out.println("Thank you for purchasing the car/s in the selection. Please visit again. Your total bill is "+bill);
                        showroom.paymentMethod(bill);
                    }
                    return;
                }
                default:{
                    System.out.println("Please enter a valid choice.");
                }
            }
        }
    }
    public void paymentMethod(long b){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have got two options to make a payment.\n\t1. Cash\n\t2. Installments\nIf you pay by installments then you have to pay extra 10%.\n Choose the correct option.");
        int choice =  sc.nextInt();
        if(choice == 2){
            b = b + (b/10);
        }
        System.out.println("Your total bill is "+ b);
        if(choice == 1){
            return;
        }
        while(true){
            System.out.println("You can choose upto 5 installments to make this payment\n. Enter the number of installments.");  
            choice = sc.nextInt();
            if(choice > 5 || choice < 1){
                System.out.println("Sorry you can choose upto 5 installments");
                continue;
            }
            System.out.println("Your total installments are "+ choice); 
            System.out.println("Your amount of each installment is "+ (float)b/choice);
            return;
        }
    }
    public void displayCarList(){
        System.out.println(suvManual.getType()+ " "+suvManual.getCost()+" "+suvManual.getTransmissionT()+" "+suvManual.getColour());
        System.out.println(suvAuto.getType()+ " "+suvAuto.getCost()+" "+suvAuto.getTransmissionT()+" "+suvAuto.getColour());
        System.out.println(famManual.getType()+ " "+famManual.getCost()+" "+famManual.getTransmissionT()+" "+famManual.getColour());
        System.out.println(famAuto.getType()+ " "+famAuto.getCost()+" "+famAuto.getTransmissionT()+" "+famAuto.getColour());
    }
}