package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner dersler = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik, toplam = 0, sayac = 0;
        double ort;

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = dersler.nextInt();
        if (mat >= 0 && mat <= 100) {
            sayac++;
            toplam += mat;
        }

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = dersler.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            sayac++;
            toplam += fizik;
        }

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = dersler.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            sayac++;
            toplam += kimya;
        }

        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce = dersler.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            sayac++;
            toplam += turkce;
        }

        System.out.print("Tarih Notunuzu Giriniz :");
        tarih = dersler.nextInt();
        if (tarih >= 0 && tarih <= 100) {
            sayac++;
            toplam += tarih;
        }

        System.out.print("Müzik Notunuzu Giriniz :");
        muzik = dersler.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            sayac++;
            toplam += muzik;
        }

        ort = toplam / sayac;

        System.out.println(ort > 55 ? "Tebrikler Sınıfı Geçtiniz !" : "Sınıfta kaldınız, seneye görüşmek üzere !");
        System.out.println("Not Ortalamanız : " + ort);

    }
}
