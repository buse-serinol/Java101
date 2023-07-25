package basics.src.basics;
import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        int a , b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz :");
        a = input.nextInt();
        System.out.print("2. KEnarı Giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+ (b*b));
        System.out.println("Hipotenus :" + c);
    }
}
