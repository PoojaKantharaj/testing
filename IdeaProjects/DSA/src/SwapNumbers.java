import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 12;
        int b = 13;

        System.out.println("Before swap: a = " + a + ", b = " + b);
        swapNumber(a, b);
    }

    public static void swapNumber(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
