package com.company;


import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password, defaultUserName = "patika", defaultPassword = "java123", newPassword;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz :");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz :");
        password = input.nextLine();

        if (userName.equals(defaultUserName) && password.equals(defaultPassword)) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış");
            Scanner inp = new Scanner(System.in);
            System.out.println("Şifrenizi sıfırlamak için 1\nÇıkış için 2");
            secim = inp.nextInt();
            if (secim == 1) {
                inp.nextLine();
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newPassword = inp.nextLine();
                if (newPassword.equals(defaultPassword)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    newPassword = inp.nextLine();
                    if (newPassword.equals(defaultPassword)) {
                        System.out.println("Şifre oluşturulamadı.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                        defaultPassword = newPassword;
                    }
                } else {
                    System.out.println("Şifre oluşturuldu");
                    defaultPassword = newPassword;
                }
            } else if (secim == 2) {
                System.out.println("Çıkış yaptınız !");
            } else {
                System.out.println("Hatalı seçim yaptınız !");
            }
        }
    }
}
