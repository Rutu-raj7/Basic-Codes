package Number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is prime number or not ");

        int num = sc.nextInt();

        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("it is not prime number");
                break;
            }
        }
        if ((num == i)) {
            System.out.println("it is prime number");
        }
    }
}
