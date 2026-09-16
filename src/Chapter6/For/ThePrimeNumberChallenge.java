package Chapter6.For;

public class ThePrimeNumberChallenge {
    public static void main(String[] args) {

        int count = 0;

        for(int i=10; i<=50;i++){
            if(isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                count++;
                if (count==3){
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("Total number of prime number between 10 and 50 is "+ count);

    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber<=2){
            return (wholeNumber ==2);
        }

        for (int divisor =2; divisor < wholeNumber; divisor++){
            if (wholeNumber%divisor==0){
                return false;
            }
        }

        return true;
    }
}
