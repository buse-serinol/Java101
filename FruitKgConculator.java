package basics;
import java.util.Scanner;
public class FruitKgConculator {
    public static void main(String[] args) {
        double muzFiyat = 1.00, armutFiyat = 2.00, elmaFiyat = 3.67, domatesFiyat = 1.11, patlicanFiyat = 5.00, toplam;


        Scanner inp = new Scanner(System.in);
        System.out.print("Muz Kaç Kilo ? :");
        toplam = (muzFiyat * inp.nextDouble());

        System.out.print("Armut Kaç Kilo ? :");
        toplam += (armutFiyat * inp.nextDouble());

        System.out.println("toplam =" + toplam);
    }
}