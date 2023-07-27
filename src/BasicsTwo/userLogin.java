package basics.src.BasicsTwo;

import java.util.Scanner;

public class userLogin {

    public static void main(String[] args) {
        String userName, password;
        String answer = "";
        String newPassword = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Girişi :");
        userName = inp.nextLine();

        System.out.print("Parola :");
        password = inp.nextLine();


        if (userName.equals("buse") && password.equals("buse123")) {
            System.out.println("Giriş Yaptınız!");
        } else  {
            System.out.println("Hatalı Giriş Yaptınız! Yeni bir şifre oluşturmak ister misiniz? Evet-Hayır");
            answer = inp.nextLine();
        }
        if (answer.equals("Evet")) {
            System.out.println("Yeni Parola:");
            newPassword = inp.nextLine();
        } else {
            System.out.println("Şifre oluşturmadınız.");
        }
        if (newPassword.equals("buse123")) {
            System.out.println("Lütfen daha önce kullanmadığınız bir şifre oluşturunuz");
            newPassword = inp.nextLine();
        } else {
            System.out.println("Şifre oluşturuldu.");
        }


    }
}
