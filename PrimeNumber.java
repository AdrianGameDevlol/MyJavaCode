public class PrimeNumber {
    public static void main(String[] args) {
        int input=9 ;
        boolean isComposite = false;
        for(int i=2 ; input>i ; i++){
            System.out.println(i);
            if(input%i==0){
                System.out.println("I am inside if");
                isComposite = true ;
                
                break;
                
            }
        
       
        }
        if(isComposite==true){
            System.out.println("This number is composite");
            
        }
        else{
            System.out.println("This number is prime");
        }
    }
}
