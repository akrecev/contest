package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long l = scanner.nextLong();
        long r = scanner.nextLong();

        int lengthL = lengthOfNumber(l);
        int lengthR = lengthOfNumber(r);

        int[] digitsL = digitsArray(l, lengthL);
        int[] digitsR = digitsArray(r, lengthR);

        int countMiddle = (lengthR - lengthL - 1) * 9;
        int countL;
        int countR;

        if (compareNumber(l) <= 0) {
            countL = 10 - digitsL[0];
        } else {
            countL = 9 - digitsL[0];
        }

        if (compareNumber(r) < 0) {
            countR = digitsR[0] - 1;
        } else {
            countR = digitsR[0];
        }

        System.out.println(countMiddle + countL + countR);

    }

    private static int lengthOfNumber(long number) {
        if (number >= 1_000_000_000_000_000_000L) {
            return 19;
        }
        int length = 0;
        long temp = 1L;
        while (temp <= number) {
            length++;
            temp *= 10L;
        }
        return length;
    }

    private static int[] digitsArray(long number, int length) {
        int[] arr = new int[length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (int) (number % 10L);
            number /= 10L;
        }
        return arr;
    }

    private static int compareNumber(long number) {
        int length = lengthOfNumber(number);
        int[] arr = digitsArray(number, length);

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > arr[0]) {
                return 1;
            }
            if (arr[i] < arr[0]) {
                return -1;
            }
        }
        return 0;
    }
}
