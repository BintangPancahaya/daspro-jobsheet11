    package Pertemuan13;

    public class PengunjungCafe05 {

        public static void daftarPengunjung(String... namaPengunjung) {
            System.out.println("Daftar Nama Pengunjung:");
            for (String nama : namaPengunjung) { // for-each loop
                System.out.println("- " + nama);
            }
        }
        public static void main(String[] args) {
            daftarPengunjung("Ali", "Budi", "Citra");
        }
    }