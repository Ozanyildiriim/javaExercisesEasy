package Chapter6.challenges;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int x, int y, int z) {
        if(isValid(x) && isValid(y) && isValid(z)){
            int xDigit = x%10;
            int yDigit = y%10;
            int zDigit = z%10;

            return xDigit == yDigit || yDigit == zDigit || zDigit == xDigit;
        }return false;

    }

    public static boolean isValid (int x) {
        return x >= 10 && x <= 1000;
    }
}
