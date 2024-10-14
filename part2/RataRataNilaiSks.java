package part2;

import java.util.Scanner;

// Pseudocode
// Start
    // int nilaiMathematika, nilaiAlgoritma, avgAverageWeighted, totalSKS
    // Tetapkan totalSKS = 2 + 3
    // masukan nilaiMathematika
    // masukan nilaiAlgoritma
    // Hitung avgAverageWeighted = (nilaiMathematika * 2 + nilaiAlgoritma * 3) / totalSKS
    // Tampilkan avgAverageWeighted
// End

public class RataRataNilaiSks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inisialisasi
        double nilaiMatematika, nilaiAlgoritma, rataRataBerbobot;
        int sksMatematika = 2;
        int sksAlgoritma = 3;
        int totalSKS = sksMatematika + sksAlgoritma;

        // Input nilai
        System.out.print("Masukkan nilai Matematika: ");
        nilaiMatematika = scanner.nextDouble();

        System.out.print("Masukkan nilai Algoritma: ");
        nilaiAlgoritma = scanner.nextDouble();

        // Menghitung rata-rata
        rataRataBerbobot = (nilaiMatematika * sksMatematika + nilaiAlgoritma * sksAlgoritma) / totalSKS;

        // Menampilkan hasil
        System.out.println("Rata-rata berbobot: " + rataRataBerbobot);

        scanner.close();
    }
}
