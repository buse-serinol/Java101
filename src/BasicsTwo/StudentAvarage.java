package basics.src.BasicsTwo;
import java.util.Scanner;

public class StudentAvarage {

    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, muzik;


        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.println("Türkçe notunuz: " );
        turkce = input.nextInt();

        System.out.println("Fizik notunuz: " );
        fizik = input.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.println("Müzik notunuz: " );
        muzik = input.nextInt();

        double avarage = (mat + turkce + fizik + kimya + muzik) / 5;

        if (avarage <= 55) {
            System.out.println("Üzgünüz. Sınıfta Kaldınız. ");
            System.out.println("Ortalamanız: " + avarage);

        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz.");
            System.out.println("Ortalamanız: " + avarage);


        }
    }
}