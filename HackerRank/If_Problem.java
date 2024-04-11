package HackerRank;

import java.util.Scanner;

public class If_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("not weired");
            } else if (n >= 6 && n <= 20) {
                System.out.println("weired");
            } else {
                System.out.println("weired");
            }

        } else {
            System.out.println("weired");
        }
    }
}
