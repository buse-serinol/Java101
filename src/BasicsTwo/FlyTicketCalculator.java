package basics.src.BasicsTwo;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FlyTicketCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, tripType;
        double total;
        // mesafe başı ücret 0,10

        System.out.println("Mesafeyi giriniz: ");
        km = input.nextInt();

        System.out.println("Yaşınız:");
        age = input.nextInt();


        System.out.println("Yolculuk tipi(Tek yön için 1, gidiş-dönüş için 2");
        tripType = input.nextInt();

        if (km > 0 && age>=0 && age < 150 && tripType == 1 || tripType == 2  ) {

            // hesaplamalar :

            total = (km * 0.10);

            if (age < 12) {
                total = total - (total * 0.5);
            }
            if (age >=12 && age <=24) {
                total = total - (total * 0.1);
            }
            if (age >= 65) {
                total = total - (total * 0.3);
            }
            if (tripType == 2) {
                total = total - (total * 0.2);
            }


            System.out.println(total);
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }





    }
}
