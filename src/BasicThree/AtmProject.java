package basics.src.BasicThree;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;



        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();

            if (userName.equals("buse") && password.equals("123")) {
                System.out.println("Merhaba, Caner Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Lütfen çekmek istediğiniz miktarı giriniz:");
                            price = input.nextInt();
                            balance -= price;
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);

                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;

            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanızla iletişime geçiniz.");
                }
                System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.");
                System.out.println("Kalan hakkınız:" + right);
            }
        }


    }
}
