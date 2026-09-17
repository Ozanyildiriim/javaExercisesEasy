package Chapter6.challenges;

public class FactorPrinter {
    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        int divisor = 1;
        int count=0;
        while(divisor<=number){
            if(number%divisor==0){
                count++;
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}

