package Pertemuan13;

import java.util.Scanner;
public class Tugas305 {
    static int nilai[][] = new int[5][7];
    static String nama[];
    static void inputMhs() {
        Scanner input05 = new Scanner(System.in);
        System.out.println("=========== INPUT BANYAKNYA MAHASISWA ===========");
        System.out.println("\nMasukkan banyaknya mahasiswa : ");
        int banyak = input05.nextInt();
        nama = new String [banyak];
            return;
        }
        static void inputTugas() {
            Scanner input05 = new Scanner(System.in);
            System.out.println("=========== INPUT BANYAKNYA TUGAS ===========");
            System.out.println("\nMasukkan banyaknya tugas : ");
            int banyakTugas = input05.nextInt();
            return;
        }
        static void inputNama() {
            Scanner input05 = new Scanner(System.in);
            System.out.println("=========== INPUT NAMA MAHASISWA ===========");
            for (int i=0; i < nilai.length; i++) {
                System.out.println("======= Nilai Mahasiswa " + nama[i] + " =======");
                for (int j=0; j < nilai[0].length; j++) {
                    System.out.print("Masukkan nilai pada minggu ke-"+(j+1)+": ");
                    nilai[i][j] = input05.nextInt();
                }
                System.out.println();
            }
            input05.close();
            return;
        }
        static void inputNilai() {
            Scanner input05 = new Scanner(System.in);
                System.out.println("=========== INPUT NILAI MAHASISWA ===========");
                for (int i=0; i < nilai.length; i++) {
                    System.out.println("======= Nilai Mahasiswa " + nama[i] + " =======");
                    for (int j=0; j < nilai[0].length; j++) {
                        System.out.print("Masukkan nilai pada minggu ke-"+(j+1)+": ");
                        nilai[i][j] = input05.nextInt();
                    }
                    System.out.println();
                }
                input05.close();
                return;
        }
        static void dataMhs() {
            System.out.println("========= DATA MAHASISWA =========");
            for (int i=0; i < nilai.length; i++) {
                System.out.println("===== Nilai Mahasiswa " + nama[i] + " =====");
                for (int j=0; j < nilai[0].length; j++) {
                    System.out.println("Nilai pada minggu ke-"+(j+1)+": " + nilai[i][j]);
                }
                System.out.println();
            }
            return;
    }
    static void hari() {
        System.out.println("================== NILAI TERTINGGI (HARI) ==================");
        int temp[] = new int[7];
        int tertinggi = 0;
        int hari = 0;
        for (int i=0; i < nilai[0].length; i++) {
            for (int j=0; j < nilai.length; j++) {
                temp[i] += nilai[j][i];
            }
        }
        for (int i=0; i < 7; i++) {
            if (temp[i] > tertinggi) {
                tertinggi = temp[i];
                hari = i+1;
            }
        }
        System.out.println("Nilai tertinggi pada minggu ke-" + hari + ", dengan total nilai: " + tertinggi);
        System.out.println();
        return;

    }
    static void mhsTertinggi() {
        System.out.println("============================= NILAI TERTINGGI (MAHASISWA) =============================");
        int tertinggi = 0;
        int minggu = 0;
        String mhs = "";
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] > tertinggi) {
                    tertinggi = nilai[i][j];
                    mhs = nama[i];
                    minggu = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa yang memiliki nilai tertinggi adalah " + mhs + " dengan nilai " + tertinggi + " pada minggu ke-" + minggu);
        return;
    }
    public static void main(String[] args) {
        inputNama();
        dataMhs();
        hari();
        mhsTertinggi();
    }
}