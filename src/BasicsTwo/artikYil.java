package basics.src.BasicsTwo;
import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();


        if (year % 400 == 0 || year % 4 == 0) {
                System.out.println(year + " bir artık yıldır.");

            }else {
                System.out.println(year + " artık yıl değildir.");
            }

        }
    }

