package basics.src.BasicThree;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç elemanlı bir seri olsun? ");
        int loop = input.nextInt();
        int n1=0;
        int n2=1;
        if (loop > 0) {
            System.out.println(n1);
            System.out.println(n2);
            for (int i=0; i < loop; i++) {
                int number=n1+n2;
                System.out.println(number);
                n1=n2;
                n2=number;
            }
        }else {
            System.out.print("Geçerli bir sayı giriniz.");
        }


    }
}
