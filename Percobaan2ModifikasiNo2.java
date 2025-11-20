import java.util.Scanner;
public class Percobaan2ModifikasiNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int baris, kolom;
        int menu;

        do {
            System.out.println("=== Menu Bioskop ===");
            System.out.println("1. Input data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine();

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

                    if(penonton[baris][kolom] != null){
                        System.out.println("Kurasi sudah terisi.");
                        break;
                    }

                    System.out.print("Masukkan nama: ");
                    penonton[baris][kolom] = scanner.nextLine();
                    break;

                    case 2:
                        for(int i=0; i<4; i++){
                            for(int j=0; j<2; j++){
                                if(penonton[i][j] == null){
                                    System.out.print("*** ");
                                } else {
                                    System.out.print(penonton[i][j] + " ");
                                }
                            }
                            System.out.println();
                        }
                        break;
            }
        } while(menu != 3);
    }
}