public class Mathematics {
    public int Addition(int Number1, int Number2 ){
        return Number1+Number2;
    }
    public int Subtraction(int Number1, int Number2){
        if(Number1>=Number2){
            return Number1-Number2;
        }
        else{ 
            return Number2-Number1;
        }
    }
    public int Multiplication(int Number1, int Number2 ){
        return Number1*Number2;
    }
    public int Division(int Numerator, int Denominator){
        return Numerator/Denominator;
    }
    public boolean PrimeNumber(int input){
        for(int i=2;i<input;i++){
            if(input % i == 0){
                //System.out.println("It is a prime number");
                return false;
            }
        }
        return true;
    }
    void displayPerfectNumbers(int range){
        int sum;
        for(int i=1 ; i<=range ; i++){
            sum = 0;
            for(int j=1 ; j < i ; j++){
                if(i%j==0){
                    sum = sum + j;
                }
            }
                if(sum==i){
                    System.out.println("The perfect numbers are "+i);
                }
            } 
        }
    }
