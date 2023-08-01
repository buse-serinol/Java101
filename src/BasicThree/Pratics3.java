package basics.src.BasicThree;
import java.util.Scanner;

public class Pratics3 {
    public static void main(String[] args) {
        // alıştırmanın while ile yapımı
        int i=1, n;

        Scanner input = new Scanner(System.in);

        System.out.println("Sınır sayısı giriniz: ");
        n = input.nextInt();

        while (i < n) {
            System.out.println(i);
            i *= 2;
        }




        }
    }

