import java.util.Scanner;
public class Percobaan4Modifikasi {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        // untuk input nilai mahasiswa
        for(int i=0; i<jumlahSiswa; i++) {
            System.out.println("Input nilai siswa ke-" + (i+1));
            for(int j=0; j<jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
        // Rata-rata per siswa
        System.out.println("\n=== RATA-RATA PER SISWA ===");
        for(int i=0; i<jumlahSiswa; i++) {
            int total = 0;
            for(int j=0; j<jumlahMataKuliah; j++) {
                total += nilai[i][j];        
            }
            System.out.println("Siswa " + (i+1) + ": " + (total/jumlahMataKuliah));
        }

        // Rata-rata per mata kuliah
        System.out.println("\n=== RATA-RATA PER MATA KULIAH ===");
        for(int j=0; j<jumlahMataKuliah; j++) {
            int total = 0;
            for(int i=0; i<jumlahSiswa; i++) {  
                total += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + (total/jumlahSiswa));
        }
    }
}