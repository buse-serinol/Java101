package basics.src.BasicThree;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int i=1;
        int ebob=1;

        while(i <= n1) {
            if (n1%i == 0 && n2%i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);

        int ekok=(n1*n2) / ebob;
        System.out.println("EKOK: " + ekok);
    }
}
