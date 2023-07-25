package basics.src.basics;
import java.util.Scanner;
public class FruitKgConculator {
    public static void main(String[] args) {
        double muzFiyat = 0.95, armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, patlicanFiyat = 5.00, toplam;


        Scanner inp = new Scanner(System.in);
        System.out.print("Muz Kaç Kilo ? :");
        toplam = (muzFiyat * inp.nextDouble());

        System.out.print("Armut Kaç Kilo ? :");
        toplam += (armutFiyat * inp.nextDouble());

        System.out.print("Elma Kaç Kilo ? :");
        toplam += (elmaFiyat * inp.nextDouble());

        System.out.print("Domates Kaç Kilo ? :");
        toplam += (domatesFiyat * inp.nextDouble());

        System.out.print("Patlıcan Kaç Kilo ? :");
        toplam += (patlicanFiyat * inp.nextDouble());

        System.out.println("toplam =" + toplam);

    }
}