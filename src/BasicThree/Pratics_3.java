package basics.src.BasicThree;
import java.util.Scanner;
public class Pratics_3 {
    public static void main(String[] args) {
        int n;
            Scanner input= new Scanner(System.in);

        System.out.println("Sınır sayısını giriniz: ");
        n = input.nextInt();

        System.out.println("Gİrilen sayıya kadar olan 4'ün kuvvetleri");
          for (int i =1; i<=70; i*=4) {
              System.out.println(i);
      }

        System.out.println("-------------------------");

        System.out.println("Gİrilen sayıya kadar olan 5'in kuvvetleri");
        for (int i =1; i<=70; i*=5) {
            System.out.println(i);
        }
    }
}
