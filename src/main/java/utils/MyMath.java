package utils;

public class MyMath {

    public static int getDigitsSum(final int i) {
        int src = i;
        int sum = 0;
        while (src > 0) {
            sum += src % 10;
            src /= 10;
        }
        return sum;
    }
}
