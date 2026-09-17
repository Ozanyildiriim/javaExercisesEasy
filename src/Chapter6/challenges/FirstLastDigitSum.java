package Chapter6.challenges;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        if(number<0){
            return -1;
        }
        int lastDigit= number%10;

        while(number>=10){
            number /=10;
        }
        int firstDigit = number;
        return firstDigit+lastDigit;

    }
}
