package part1;
import java.util.Scanner;

// Pseudocode
// Start
    // double kecepatanA, kecepatanB, jarak, waktuBertemu, jarakBertemuA, jarakBertemuB
    // Input kecepatan mobil A
    // Input kecepatan mobil B
    // Input jarak antara kedua mobil
    // Hitung WaktuBertemu = jarak / (kecepatanA + kecepatanB)
    // Hitung JarakBertemuA = WaktuBertemu * kecepatanA
    // Hitung JarakBertemuB = WaktuBertemu * kecepatanB
    // Output WaktuBertemu
    // Output JarakBertemuA
    // Output JarakBertemuB
// End


public class WaktuBertemu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kecepatan mobil A
        System.out.print("Masukkan kecepatan mobil A (km/jam): ");
        double kecepatanA = scanner.nextDouble();

        // Input kecepatan mobil B
        System.out.print("Masukkan kecepatan mobil B (km/jam): ");
        double kecepatanB = scanner.nextDouble();

        // Input jarak antara kedua mobil
        System.out.print("Masukkan jarak antara kedua mobil (km): ");
        double jarak = scanner.nextDouble();

        // Menghitung waktu bertemu
        double waktuBertemu = jarak / (kecepatanA + kecepatanB);

        // Menghitung jarak bertemu dari mobil A
        double jarakBertemuA = waktuBertemu * kecepatanA;

        // Menghitung jarak bertemu dari mobil B
        double jarakBertemuB = waktuBertemu * kecepatanB;

        // Output hasil perhitungan
        System.out.println("Waktu bertemu: " + waktuBertemu + " jam");
        System.out.println("Jarak bertemu dari mobil A: " + jarakBertemuA + " km");
        System.out.println("Jarak bertemu dari mobil B: " + jarakBertemuB + " km");

        scanner.close();
    }
}
