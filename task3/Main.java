package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int t = scanner.nextInt();
        int[] floors = new int[count + 1];
        for (int i = 1; i <= count; i++) {
            floors[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int time;

        if (((floors[n] - floors[1]) <= t) || ((floors[count] - floors[n]) <= t)) {
            time = floors[count] - floors[1];
        } else if ((floors[n] - floors[1]) < (floors[count] - floors[n])) {
            time = (floors[n] - floors[1]) + (floors[count] - floors[1]);
        } else {
            time = (floors[count] - floors[n]) + (floors[count] - floors[1]);
        }

        System.out.println(time);
    }
}
