package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] heightArray = new int[length];
        int even = -1;
        int odd = -1;
        int evenCounter = 0;
        String output = "-1 -1";

        for (int i = 0; i < length + 1; i++) {
            if (i < length) {
                heightArray[i] = scanner.nextInt();
                if ((heightArray[i] % 2) == 0) {
                    evenCounter++;
                }
            }

            if (i > 0) {
                if (i % 2 != 0) {
                    if ((heightArray[i - 1] % 2) == 0) {
                        odd = i;
                    }
                } else if ((heightArray[i - 1] % 2) != 0) {
                    even = i;
                }
            }
        }

        if ((even == -1 || odd == -1) || evenCounter != (length / 2)) {
            System.out.println(output);
        } else {
            System.out.println(even + " " + odd);
        }
    }
}
