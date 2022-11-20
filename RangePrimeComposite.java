public class RangePrimeComposite {
    public static void main(String[] args) {
        int input=15;
        int countEven=0;

        for(int i=1;i<=input;i++){
            if(i%2==0){
                countEven++;
                
            }

        }
        System.out.println("The number of odd numbers are "+(input - countEven));
        System.out.println("The number of even numbers are "+countEven);
    }
}
