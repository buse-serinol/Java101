package basics;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
      double tutar, kdvOrani = 0.18, kdvTutar, kdvliTutar;

      Scanner input = new Scanner(System.in);
      System.out.print("Ücret Tutarını Giriniz : ");
      tutar = input.nextDouble();

      kdvTutar = kdvOrani * tutar;
      kdvliTutar = kdvTutar + tutar;

      System.out.println("KDV'siz Tutar :" + tutar);
      System.out.println("KDV Oranı :" + kdvOrani);
      System.out.println("KDV'li Tutar :"+ kdvliTutar);
      System.out.println("KDV Tutarı :"+ kdvTutar);



    }
}
