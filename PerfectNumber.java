public class PerfectNumber {
    public static void main(String[] args) {
        int input=6;
        int ans=1;
        int count=0;
        for(int i=2;i<input;i++){
            if(input%i==0){
                count++;
                ans=ans*i;
            }
        }
        if(ans==input){
System.out.println("It is a perfect number and the number of factors are "+count);
        }
          else{
            System.out.println("It is not a perfect number");
          } 
    }
}
