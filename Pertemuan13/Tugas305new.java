package Pertemuan13;
import java.util.Scanner;

public class Tugas305new {
    static Scanner scanner = new Scanner(System.in);
    static String[] namaMahasiswa;
    static int[][] nilaiMahasiswa;

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas setiap mahasiswa: ");
        int jumlahTugas = scanner.nextInt();

        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];

        inputMahasiswa(jumlahMahasiswa, jumlahTugas);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua nilai mahasiswa");
            System.out.println("2. Cari tugas dengan nilai tertinggi");
            System.out.println("3. Tampilkan mahasiswa dengan nilai tertinggi pada tugas tertentu");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1 -> tampilkanNilai();
                case 2 -> cariTugasNilaiTertinggi();
                case 3 -> mahasiswaNilaiTertinggiPadaTugas();
                case 4 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    static void inputMahasiswa(int jumlahMahasiswa, int jumlahTugas) {
        scanner.nextLine(); 
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai tugas ke-" + (j + 1) + " untuk " + namaMahasiswa[i] + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
                scanner.nextLine(); 
            }
        }
    }
    static void tampilkanNilai() {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void cariTugasNilaiTertinggi() {
        int maxNilai = Integer.MIN_VALUE;
        int tugasKe = -1;

        for (int i = 0; i < nilaiMahasiswa[0].length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < namaMahasiswa.length; j++) {
                totalNilai += nilaiMahasiswa[j][i];
            }
            if (totalNilai > maxNilai) {
                maxNilai = totalNilai;
                tugasKe = i;
            }
        }

        System.out.println("Tugas ke-" + (tugasKe + 1) + " memiliki nilai total tertinggi: " + maxNilai);
    }

    static void mahasiswaNilaiTertinggiPadaTugas() {
        System.out.print("Masukkan tugas keberapa (1-" + nilaiMahasiswa[0].length + "): ");
        int tugasKe = scanner.nextInt() - 1;

        if (tugasKe >= 0 && tugasKe < nilaiMahasiswa[0].length) {
            int maxNilai = Integer.MIN_VALUE;
            String namaPemenang = "";

            for (int i = 0; i < namaMahasiswa.length; i++) {
                if (nilaiMahasiswa[i][tugasKe] > maxNilai) {
                    maxNilai = nilaiMahasiswa[i][tugasKe];
                    namaPemenang = namaMahasiswa[i];
                }
            }

            System.out.println("Mahasiswa dengan nilai tertinggi pada tugas ke-" + (tugasKe + 1) + " adalah " +
                               namaPemenang + " dengan nilai " + maxNilai);
        } else {
            System.out.println("Indeks tugas tidak valid.");
        }
    }
}
