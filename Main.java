package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double kmUcreti = 0.1, normalTutar, odenecekTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        if (mesafe < 0 || yas < 0 || (yolculukTipi < 1 || yolculukTipi > 2)) {
            System.out.print("Hatalı Veri Girdiniz");
        }
        normalTutar = mesafe * kmUcreti;

        if (yas < 12) {
            odenecekTutar = normalTutar / 2;
        } else if (yas >= 12 && yas <= 24) {
            odenecekTutar = normalTutar - (normalTutar * 10 / 100);
        } else if (yas > 65) {
            odenecekTutar = normalTutar - (normalTutar * 30 / 100);
        } else {
            odenecekTutar = normalTutar;
        }

        if (yolculukTipi == 2) {
            odenecekTutar = (odenecekTutar - (odenecekTutar * 20 / 100)) * 2;
        }

        System.out.print("Toplam Tutar = " + odenecekTutar + "TL");
    }
}
