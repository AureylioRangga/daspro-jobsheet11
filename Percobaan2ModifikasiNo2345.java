import java.util.Scanner;
public class Percobaan2ModifikasiNo2345 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int baris, kolom;
        int menu;

        // untuk menampilkan menu
        do {
            System.out.println("=== Menu Bioskop ===");
            System.out.println("1. Input data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

            // input data penonton
            switch(menu){
                case 1:
                    System.out.print("Masukkan baris (0-3): ");
                    baris = scanner.nextInt();
                    System.out.print("Masukkan kolom (0-1): ");
                    kolom = scanner.nextInt();
                    scanner.nextLine();

                    if(baris < 0 || baris >= 4 || kolom < 0 || kolom >= 2){
                        System.out.println("kursi tidak tersedia.");
                        break;
                    }

                    // Modifikasi nomor 3 Handle nomor kursi tidak tersedia
                    if(penonton[baris][kolom] != null){
                        System.out.println("Kurasi sudah terisi.");
                        break;
                    }

                    // input nama penonton
                    System.out.print("Masukkan nama: ");
                    penonton[baris][kolom] = scanner.nextLine();
                    break;

                    //  untuk menampilkan daftar penonton
                    case 2:
                        for(int i=0; i<4; i++){
                            for(int j=0; j<2; j++){

                                // Modifikasi nomor 4 pengecekan jika kursi terisi
                                if(penonton[i][j] == null){
                                    // Modifikasi nomor 5 menampilkan *** jika kursi kosong
                                    System.out.print("*** ");
                                } else {
                                    System.out.print(penonton[i][j] + " ");
                                }
                            }
                            //untuk memindahkan baris
                            System.out.println();
                        }
                        break;
            }
        } while(menu != 3);
    }
}