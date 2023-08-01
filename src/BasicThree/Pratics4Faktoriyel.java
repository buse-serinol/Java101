package basics.src.BasicThree;
import java.util.Scanner;
public class Pratics4Faktoriyel {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Fakötiyel sayısı: ");
        int n = inp.nextInt();
        int total=1;

        for(int i = 1; i<=n; i++ ) {
            System.out.println(i);
            total = total * i;
        }
        System.out.println(n + ". Faktöriyel: " + total);
    }
}
