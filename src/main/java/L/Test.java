package L;

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int n = scan.nextInt();

            if (n <= 1) {
                System.out.println(n + " is not a prime number.");
            } else if (n <= 3) {
                System.out.println(n + " is a prime number.");
            } else if (n % 2 == 0 || n % 3 == 0) {
                System.out.println(n + " is not a prime number.");
            } else {
                int i = 5;
                while (i * i <= n) {
                    if (n % i == 0 || n % (i + 2) == 0) {
                        System.out.println(n + " is not a prime number.");
                        return;
                    }
                    i += 6;
                }
                System.out.println(n + " is a prime number.");
            }
        }

}
