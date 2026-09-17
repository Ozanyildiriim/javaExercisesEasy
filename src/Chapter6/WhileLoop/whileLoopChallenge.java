package Chapter6.WhileLoop;

public class whileLoopChallenge {
    public static void main(String[] args) {

        int j =4;
        int evenCount=0;
        int oddCount=0;

        while(j<=20){
            j++;
            if(isEvenNumber(j)){
                System.out.println("Even number "+ j);
                evenCount++;
                if (evenCount>=5){
                    break;
                }
                continue;
            }
            oddCount++;

        }
        System.out.println(oddCount);
        System.out.println(evenCount);

    }
    public static boolean isEvenNumber(int x) {
        return x % 2 == 0;
    }



}
