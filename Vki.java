package basics;
import java.util.Scanner;
public class Vki {
    public static void main(String[] args) {
        int kg;
        double size;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :");
        size = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg = inp.nextInt();

        double vki = kg/(size*size);
        System.out.println("Vücut Kitle İndeksiniz :" + vki );


    }
}
