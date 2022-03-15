package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi, toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");

            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
                System.out.println(sayi);
            }

        } while (sayi % 2 == 0);

        System.out.print("Toplam :" + toplam);
    }
}
