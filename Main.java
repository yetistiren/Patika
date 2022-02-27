package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int yil;
        boolean isArtik = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                isArtik = true;
            }
        } else if (yil % 4 == 0) {
            isArtik = true;
        }

        if (isArtik) {
            System.out.print(yil + " bir artık yıldır !");
        } else {
            System.out.print(yil + " bir artık değildir !");
        }

    }
}
