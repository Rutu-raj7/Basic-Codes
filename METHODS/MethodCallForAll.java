package METHODS;

public class MethodCallForAll {
    public static void main(String[] args) {
        power();
        factorial();
        evenNumber();
        primeNumber();
    }

    public static void power() {
        int base = 3;
        int raise = 4;
        int power = 1;

        for (int i = 1; i <= raise; i++) {
            power = power * base;
        }
        System.out.println(power);
    }

    public static void factorial() {
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void evenNumber() {
        int num = 45;
        if (num % 2 == 0) {
            System.out.println("entered number is even number");
        } else {
            System.out.println("it is not even number");
        }
    }

    public static void primeNumber() {
        int num = 7;
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (num == i) {
            System.out.println("it is a prime number" + num);
        } else {
            System.out.println("it is not prime number");
        }
    }
}
