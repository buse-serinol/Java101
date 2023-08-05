package basics.src.BasicThree;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total=0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i=1; i<number; i++) {
            if (number%i==0) {
                total+=i;
            }
        }
        if (total==number) {
            System.out.println(number + " bir mükemmel sayıdır.");
        }else {
            System.out.print(number + " mükemmel sayı değildir.");
        }
    }
}
