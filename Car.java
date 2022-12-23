//Car.class contains the byte code of the class Car
public class Car {
    String type; //anything among Sedan, Mini and SUV This is called a property of 
    //class Car you may also call it a variable
    String fuel; 
    void run(int gear, int speed){
        System.out.println("Car is ruuning at speed "+ speed+ " and gear "+gear);
    }
    static float calculatePercentage(int maxMarks, float marks){
        //System.out.println("This is cars calculate percentage");
        float percentage = marks/maxMarks*100;
        //System.out.println("percentage is "+percentage);
        return percentage;
    }
    public static void main(String[] args) {
        Car a = new Car(); //Creating an object of car so that we can use
        //the methods of car
        a.run(1,15);
        calculatePercentage(0, 0);

        float adriansPercentage;
        float deepanshusPercentage;
        //Below I am calling the method, I am not using any object to call the mnethod
        //because the method is a static method
        //I am saving the returned data in a variable for further use
        adriansPercentage = calculatePercentage(100, 10);
        deepanshusPercentage = calculatePercentage(100, 80);

        if(adriansPercentage>deepanshusPercentage){
            System.out.println("Adrian is the winner");
        }
        else{
            System.out.println("deepanshu is the winner");
        }
        
    }

}
