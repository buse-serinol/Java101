package basics.src.BasicsTwo;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        if (day >= 1 && day <= 31) {
            if (month == 1) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            }
            if (month == 2) {
                if (day < 20 ) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            }
            if (month == 3) {
                if (day < 21) {
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            }
            if (month == 4) {
                if (day < 21) {
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }
            if (month == 5) {
                if (day < 22) {
                    burc = "Boğa";
                }else {
                    burc = "İkizler";
                }
            }
            if (month == 6) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            }

        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı gün girdiniz.");
        }
        System.out.println(burc);
    }
}


