import java.util.Arrays;
import java.util.Scanner;

public class cake {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("input the size of candles");
        int n = scanner.nextInt();
        int[] myCandles = new int[n];
        System.out.println("input the height of each candle");

        for (int i = 0; i < n; i++) {
            myCandles[i] = scanner.nextInt();
        }
        System.out.println(birthdayCakeCandles(myCandles));

    }

    public static int birthdayCakeCandles(int[] myCandles) {
        int count = 0;
        int max = 0;
        for (int num : myCandles) {
            if (max < num) {
                max = num;
                count = 1;
            } else if (max == num) {
                count++;
            }
        }
        return count;

    }

}


