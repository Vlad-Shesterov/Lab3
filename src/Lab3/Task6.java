package Lab3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        String firstText = "Size of Array: ";

        Scanner scanner = new Scanner(System.in);
        System.out.println(firstText);

        if (scanner.hasNextInt()) {

            int n = Integer.parseInt(scanner.next());
            if (n <= 0) {
                System.out.println("This value is not enough");
                System.exit(0);
            }
            int[] arrDigits = new int[n];
            int k = 0;
            double valSquare = 2;
            double p = (double) n;
            double limitDigit = Math.pow(p, valSquare);
            int digit = (int) limitDigit + 5;

            for (int i = 0; i <= digit; i++) {
                if (i % 5 == 2) {
                    arrDigits[k] = i;
                    k++;
                    if (k >= n) {
                        break;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arrDigits[j] + "\t");
            }
        } else {
            System.out.println("This is not a digit!");
        }
    }
}