package Pertemuan13;
import java.util.Scanner;

public class Kafe05Nilai {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        // Evaluasi kode promo
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
            System.out.println("Kode promo berlaku: DISKON50. Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
            System.out.println("Kode promo berlaku: DISKON30. Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        // Menampilkan menu
        Menu("Andi", true);

        int totalKeseluruhan = 0;

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = input05.next();

        char ulang;
        do {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = input05.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = input05.nextInt();

            // Hitung harga untuk menu yang dipilih
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            ulang = input05.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\nTotal keseluruhan pesanan anda: Rp " + totalKeseluruhan);
        input05.close();
    }
}
