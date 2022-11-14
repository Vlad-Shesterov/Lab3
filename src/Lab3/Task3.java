package Lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в последовательности Фибоначчи");
        int a = 1;
        int b = 1;
        int n = scanner.nextInt();
        for (int i = 2; i < n; ++i) {
            int next = a + b;
            a = b;
            b = next;
            System.out.println(next);
        }


    }
}
