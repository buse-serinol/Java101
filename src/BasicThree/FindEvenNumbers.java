package basics.src.BasicThree;
import java.util.Scanner;
public class FindEvenNumbers {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; ++i) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }

        }
    }
}
