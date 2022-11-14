package Lab3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int sum = a + b;
        scanner.close();
    if (sum %5 == 2 && sum %3 == 1){
        System.out.println(sum);
        }else{
        System.out.println("Не подходит");
        }

    }
}
