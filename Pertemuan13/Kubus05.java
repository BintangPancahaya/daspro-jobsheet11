package Pertemuan13;

import java.util.Scanner;
public class Kubus05 {
     static int hitungVolume (int a) {
        int volume = (int) Math.pow(a, 3);
        return volume;
     }
     static int hitungLuasPermukaan (int b) {
        int luasPermukaan = 6 * (int) Math.pow(b, 2);
        return luasPermukaan;
     } 
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus: ");
        int sisi = input.nextInt();

        int vol = hitungVolume(sisi);
        System.out.println("Volume kubus adalah "+vol);

        int lp = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah "+lp);
        input.close();
     }
}
