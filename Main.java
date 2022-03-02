package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi, toplam = 0, sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");

        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 12 == 0) {
                sayac++;
                toplam += i;
            }
        }

        if (sayac == 0) {
            System.out.print("0'dan girilen sayı arasında 3 ve 4'e tam olarak bölün sayı yoktur.");
        } else {
            System.out.print("Ortalama : " + toplam / sayac);
        }
    }
}
