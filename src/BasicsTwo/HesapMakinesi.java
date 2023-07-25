package basics.src.BasicsTwo;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        number1 = inp.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        number2 = inp.nextInt();

        System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme :");
        System.out.println("Seçiminiz :");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam:" + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma:" + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma:" + (number1 * number2));
                break;
            case 4:
                System.out.println("Bölme:" + (number1 / number2));
                if (number2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez!");
                    break;
                }
            default:
                System.out.println("Hatalı bir seçim yaptınız! Tekrar deneyin.");
        }
    }
}
