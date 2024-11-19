package Pertemuan13;
import java.util.Scanner;

public class Tugas205 {
      static String nama[] = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
      static int jual[][] = new int[5][7];
      static Scanner input05 = new Scanner(System.in);
    
    static void input() {
        System.out.println("\n====================== INPUT DATA PENJUALAN ======================");
            for (int i=0; i < jual.length; i++) {
                System.out.println("\n=============== Menu " + nama[i] + " ===============");
                for (int j=0; j < jual[0].length; j++) {
                    System.out.print("Masukkan banyaknya "+ nama[i]+ " yang dijual pada hari ke-"+(j+1)+": ");
                    jual[i][j] = input05.nextInt();
                }
            }
            return;
    }
    static void dataJual() {
        System.out.println("\n========= HASIL DATA PENJUALAN =========");
        for (int i=0; i < jual.length; i++) {
            System.out.println("\n===== Penjualan " + nama[i] + " =====");
            for (int j=0; j < jual[0].length; j++) {
                System.out.println("Pada hari ke-"+(j+1)+" terjual sebanyak : " + jual[i][j]);
            }
        }
        return;
    }
    static void menuTertinggi() {
        System.out.println("\n================== PENJUALAN TERTINGGI ==================");
        int temp[] = new int[7];
        int tertinggi = 0;
        String menu = "";
        for (int i=0; i < jual.length; i++) {
            for (int j=0; j < jual[0].length; j++) {
                temp[i] += jual[i][j];
            }
        }
        for (int i=0; i < 7; i++) {
            if (temp[i] > tertinggi) {
                tertinggi = temp[i];
                menu = nama[i];
            }
        }
        System.out.println("Menu yang memiliki penjualan tertinggi adalah " + menu + " dengan total penjualan sebesar: " + tertinggi);
        return;

    }
    static void rataJual() {
        System.out.println("\n============================= RATA - RATA PENJUALAN =============================");
        double total = 0;
        double rata[] = new double[5];
        for (int i = 0; i < jual.length; i++) {
            total = 0;
            for (int j = 0; j < jual[0].length; j++) {
                total += jual[i][j];
            }
            rata[i] = (int) (total/7);
            System.out.println("Untuk menu "+nama[i]+" adalah " + rata[i]);
        }
        return;
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Tampilkan seluruh data penjualan");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilih = input05.nextInt();

            switch (pilih) {
                case 1 -> input();
                case 2 -> dataJual();
                case 3 -> menuTertinggi();
                case 4 -> rataJual();
                case 5 -> {
                    System.out.println("Program selesai.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid. Coba lagi!");
            }
        }
    }
}