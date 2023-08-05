package basics.src.BasicThree;
import java.util.Scanner;
public class BiggestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int biggest=1;
        int smallest=1;
        int n;

        System.out.print("Girmek istediğiniz sayı adedini yazın: ");
        n = input.nextInt();

       for (int i=1; i <= n; i++) {
           System.out.print(i + ". sayıyı giriniz: ");
           int number = input.nextInt();
           if (i < 2){
               biggest = number;
               smallest = number;
           } else {
               if (number > biggest) {
                   biggest = number;
               }
               if (number < smallest) {
                   smallest = number;
               }
           }

       }
        System.out.println("En büyük sayı: " + biggest);
        System.out.println("En küçük sayı: " + smallest);


    }


}
