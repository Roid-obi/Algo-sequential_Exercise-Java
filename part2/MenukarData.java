package part2;

import java.util.Scanner;

// Pseudocode
// Start
    // int a, a, saveA
    // Input value pertama
    // Input value kedua
    // Simpan nilai "a" ke variabel "SaveA"
    // Tukar nilai a dengan b
    // Tukar nilai b dengan SaveA (nilai awal "a")
    // tampilkan nilai a dan b setelah ditukar
// End

public class MenukarData {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);

         // Deklarasi variabel
        int a, b, saveA;

        // Input nilai a dan b
        System.out.print("Masukkan nilai pertama: ");
        a =  scanner.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        b =  scanner.nextInt();

        // Menukar nilai a dan b
        saveA = a; // Simpan nilai a ke dalam saveA
        a = b; // Tukar nilai a dengan b
        b = saveA; // Tukar nilai b dengan nilai awal a (saveA)

        // Menampilkan hasil setelah pertukaran
        System.out.println("Nilai a setelah tertukar: " + a );
        System.out.println("Nilai b setelah tertukar: " + b );
        

        scanner.close();
    }
}
