package Chapter6.challenges;


import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);

        int sum =0;
        long avg = 0;
        int loopCount = 0;

        while (true){
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                // break the loop on invalid input
                break;
            }

            sum += scanner.nextInt();
            loopCount++;

            scanner.nextLine();
        }

        if(loopCount>0){
            avg = Math.round((double)sum/loopCount);
        }

        System.out.println("SUM = "+sum+" AVG = "+avg);

    }
}
