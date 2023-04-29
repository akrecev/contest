package task7;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int[] numbers = new int[count + 1];
        TreeSet<Integer> sorted = new TreeSet<>();
        String output = "-1 -1";
        int lostNumber = 0;
        int indexA = 0;
        int indexB = 0;

        for (int i = 1; i <= count; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] <= count) {
                sorted.add(numbers[i]);
            }
        }

        if (sorted.size() == count - 1) {
            for (int i = 1; i <= count; i++) {
                if (!sorted.contains(i)) {
                    lostNumber = i;
                }
                for (int j = i + 1; j <= count; j++) {
                    if (numbers[i] == numbers[j]) {
                        indexA = i;
                        indexB = j;
                    }
                }
                if (numbers[i] > count) {
                    indexA = i;
                }
            }

            int firstNumber = 0;
            int k = 1;
            int temp = 0;
            int flag = 0;
            if (indexA != lostNumber) {
                temp = numbers[indexA];
                numbers[indexA] = lostNumber;
                for (int i = 1; i <= count; i++) {
                    k = numbers[k];
                    if (i < count && k == 1) {
                        flag = 1;
                    }
                    if (i == count && flag == 0) {
                        firstNumber = k;
                    }
                }
            }

            if (firstNumber == 1) {
                System.out.println(indexA + " " + lostNumber);
            } else {
                if (indexB != lostNumber) {
                    if (temp > 0) {
                        numbers[indexA] = temp;
                    }
                    numbers[indexB] = lostNumber;
                    k = 1;
                    firstNumber = 0;
                    for (int i = 1; i <= count; i++) {
                        k = numbers[k];
                        if (i == count) {
                            firstNumber = k;
                        }
                    }
                }
                if (firstNumber == 1) {
                    System.out.println(indexB + " " + lostNumber);
                }
            }

        } else {
            System.out.println(output);
        }

    }
}
