package basics.src.BasicsTwo;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        a = input.nextInt();

        System.out.print("2. Sayı: ");
        b = input.nextInt();

        System.out.print("3. Sayı: ");
        c = input.nextInt();
        if (a == b && a == c && b == c)
            System.out.println("Sayılar birbirine eşittir.");

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");

            } else {
                System.out.println(" a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println(" b < c < a");
            }
        }
        if ((c < a) && (c < b)) {
            if (b < a) {
                System.out.println(" c < b < a");
            } else {
                System.out.println(" c < a < b");
            }
        }
    }
}
