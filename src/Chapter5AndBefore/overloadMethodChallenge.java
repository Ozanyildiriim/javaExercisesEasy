package Chapter5AndBefore;

public class overloadMethodChallenge {

    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("5ft, 8in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int heightInch) {
        return heightInch*2.54;
    }
    public static double convertToCentimeters(int feet,int inch) {
        return (convertToCentimeters(feet*12)+inch);

    }
}
