package Chapter6.For;

public class sum3and5challenge {
    public static void main(String[] args) {

        int sum = 0;
        int count =0;

        for(int i=1;i<=1000; i++){
            if((i%5==0) && (i%3==0)){
                count++;
                sum += i;
                System.out.println(i);
                //System.out.println(sum);
            }
            if(count==5){
                break;
            }
        }
    }
}
