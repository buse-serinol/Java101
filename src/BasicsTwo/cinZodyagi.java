package basics.src.BasicsTwo;

import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        int horoscope, year;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınız: ");
        year = input.nextInt();
        horoscope = year%12;

        switch (horoscope) {


            case 1:
                    System.out.println("Zodyak Burcunuz: Maymun");
                break;

            case 2:
                    System.out.println("Zodyak Burcunuz: Horoz");
                break;

            case 3:
                    System.out.println("Zodyak Burcunuz: Köpek");
                break;

            case 4:
                    System.out.println("Zodyak Burcunuz: Domuz");
                break;

            case 5:
                    System.out.println("Zodyak Burcunuz: Fare");
                break;

            case 6:
                System.out.println("Zodyak Burcunuz: Öküz");
                break;

            case 7:
                System.out.println("Zodyak Burcunuz: Kaplan");
                break;

            case 8:
                System.out.println("Zodyak Burcunuz: Tavşan");
                break;

            case 9:
                System.out.println("Zodyak Burcunuz: Ejderha");
                break;

            case 10:
                System.out.println("Zodyak Burcunuz: Yılan");
                break;

            case 11:
                System.out.println("Zodyak Burcunuz: At");
                break;

            case 12:
                System.out.println("Zodyak Burcunuz: Koyun");
                break;
            default:
                System.out.println("Hatalı bir yıl girdiniz.");
        }


    }
}






