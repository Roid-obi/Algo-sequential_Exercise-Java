package part1;
import java.util.Scanner;

// Pseudocode
// Start
    // double alas, tinggi, setengahAlas, sisiMiring, luas, keliling
    // Input alas
    // Input tinggi
    // Hitung sisiMiring = sqrt((alas / 2)^2 + tinggi^2)
    // Hitung luas = (alas * tinggi) / 2
    // Hitung keliling = alas + 2 * sisiMiring
    // Output luas
    // Output keliling
// End

public class SegitigaSamaKaki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alas dan tinggi segitiga
        System.out.print("Masukkan alas segitiga (dalam cm): ");
        double alas = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga (dalam cm): ");
        double tinggi = scanner.nextDouble();
        
        // Menghitung panjang sisi miring segitiga sama kaki
        double setengahAlas = alas / 2;
        double sisiMiring = Math.sqrt(Math.pow(setengahAlas, 2) + Math.pow(tinggi, 2));
        
        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;
        
        // Menghitung keliling segitiga
        double keliling = alas + 2 * sisiMiring;
        
        // Output hasil perhitungan
        System.out.println("Luas segitiga: " + luas + " cm²");
        System.out.println("Keliling segitiga: " + keliling + " cm");
        System.out.println("😅💅");
        
        scanner.close();
    }
}
