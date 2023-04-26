package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = (x & (x - 1)) == 0 ? -1 : 0;

        while (x != 0) {
            x /= 2;
            count++;
        }
        System.out.println(count);
    }

}
