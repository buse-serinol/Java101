package basics.src.Methods;
import java.util.Scanner;

public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int times(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int power(int base, int exponent) {
        for (int i = 1; i <= exponent; i++) {
            base *= base;
        }
        return base;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }






            public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int select;
            int a, b;
            int result;
            int n;
            boolean continiue = true;

            while (continiue) {

                String menu = "1- Toplama İşlemi\n"
                        + "2- Çıkarma İşlemi\n"
                        + "3- Çarpma İşlemi\n"
                        + "4- Bölme işlemi\n"
                        + "5- Üslü Sayı Hesaplama\n"
                        + "6- Faktoriyel Hesaplama\n"
                        + "7- Mod Alma\n"
                        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                        + "0- Çıkış Yap";

                System.out.println(menu);

                System.out.print("Lütfen yapmak istediğiniz işlemin numarasını giriniz: ");
                select = scan.nextInt();


                switch (select) {
                    case 1:
                        System.out.print("İlk sayı: ");
                        a = scan.nextInt();
                        System.out.print("İkinci sayı: ");
                        b = scan.nextInt();
                        result = sum(a, b);
                        System.out.println("Sonuç: " + result);
                        break;
                    case 2:
                        System.out.print("İlk sayı: ");
                        a = scan.nextInt();
                        System.out.print("İkinci sayı: ");
                        b = scan.nextInt();
                        result = minus(a, b);
                        System.out.println("Sonuç: " + result);
                        break;
                    case 3:
                        System.out.print("İlk sayı: ");
                        a = scan.nextInt();
                        System.out.print("İkinci sayı: ");
                        b = scan.nextInt();
                        result = times(a, b);
                        System.out.println("Sonuç: " + result);
                        break;
                    case 4:
                        System.out.print("İlk sayı: ");
                        a = scan.nextInt();
                        System.out.print("İkinci sayı: ");
                        b = scan.nextInt();
                        result = divide(a, b);
                        System.out.println("Sonuç: " + result);
                        break;
                    case 5:
                        System.out.print("Taban sayı: ");
                        a = scan.nextInt();
                        System.out.print("Üs sayı: ");
                        b = scan.nextInt();
                        result = power(a, b);
                        System.out.println("Sonuç: " + result);
                        break;
                    case 6:
                        System.out.print("Sayı giriniz: ");
                        n = scan.nextInt();
                        result = factorial(n);
                        System.out.println("Sonuç: " + result);
                        break;
                    case 0:
                        System.out.println("Güle Güle");
                        continiue = false;
                        break;

                }
            }


        }


    }
