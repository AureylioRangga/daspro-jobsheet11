import java.util.Scanner;
public class Percobaan3No1dan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Pertanyaan percobaan 3 No 1
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + i + ": " + myNumbers[i].length);
        }   
        // Pertanyaan Percobaan 3 No 4
         for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}   