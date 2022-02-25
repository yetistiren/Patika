package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değeri Giriniz :");
        sicaklik=input.nextInt();

        if (sicaklik < 5 ) {
            System.out.println("Kayak Yapabilirsiniz");
        }
        else
        {
            if (sicaklik<=15) {
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            else if (sicaklik>=15 && sicaklik <=25) {
                System.out.println("Pikniğe Gidebilirsiniz");
            }
            else if (sicaklik>25) {
                System.out.println("Yüzmeye Gidebilirsiniz");

            }
        }
    }
}
