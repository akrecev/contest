package task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        long sum;
        List<Long> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            int weight = 1;
            while (t > 0) {
                int digit = t % 10;
                long gain = (long) (9 - digit) * weight;
                values.add(gain);
                weight *= 10;
                t /= 10;
            }
        }

        sum = values.stream()
                .sorted(Comparator.reverseOrder())
                .limit(k)
                .reduce(0L, Long::sum);

        System.out.println(sum);
    }

}
