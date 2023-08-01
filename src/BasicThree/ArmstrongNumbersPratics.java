package basics.src.BasicThree;

import java.util.Scanner;

public class ArmstrongNumbersPratics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int basamakSayisi = 0;
        int tempNumber = number;
        int basdegeri;
        int result = 0;
        int baspow;
        while (tempNumber != 0) {
            tempNumber /= 10;
            basamakSayisi++;
        }
        //System.out.println(basamakSayisi);

        tempNumber = number;
        while (tempNumber != 0) {
            basdegeri = tempNumber % 10;
            baspow = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                baspow *= basdegeri;
            }
            result += baspow;
            tempNumber /= 10;
        }
        if (result == number) {
            System.out.println(number + " Bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " Bir armstrong sayı değildir.");
        }

        /*
        // BASAMAK SAYISI BULMA İŞLEMİ
        // sayıların kaç basamaklı olduğunu bulmak, virgülden sonraki kısmı siliyor.
        // Her silme işlemi yapıldığında sayının bir basamağı siliniyor. Böylelikle kaç basamaklı olduğunu buluyoruz.

        int a = 2451, basamakSayisi = 0, numberCounter = 0;
        //int b = a / 10;
        // System.out.print(b);

        // Bu döngü sayesinde a sıfıra eşit olmayana kadar döngü devam edeceğinden sayımızın kaç basamaklı olacağı
        // ortaya çıkıyor.

       // System.out.println(a); // döngüye girmeden önceki hali
        while (a != 0) {
            a /= 10; // a'nın yeni değerini 10'a böl ve a'ya eşitle.
            numberCounter++; //Kaç kere döndüğünü bulmak için farklı bir değişken atanır.
        }
        // BİR SAYININ SON BASAMAĞINI BULMA
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10; // her sıfır eklediğinde diğer basamağı buluruz.
        //System.out.println(c);

        int sub = 2, sup = 5;
        int result = 1;
        for (int i = 1; i<=sup; i++){
            result *= sub;
        }
        System.out.println(result);
        */


    }
}
