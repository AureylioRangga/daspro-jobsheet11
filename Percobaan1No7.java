import java.util.Scanner;
public class Percobaan1No7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array 4 baris dan 2 kolom
        String[][] penonton = new String [4][2];

        // Mengisi array dengan nama penonton
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Menampilkan seluruh data penonton
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
        
        // Menampilkan nama penonton pada baris ke-3
        System.out.println("Penonton pada baris ke-3:");

        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }
    }
}
