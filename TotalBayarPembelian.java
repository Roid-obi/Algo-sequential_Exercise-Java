import java.util.Scanner;

// Start
    // Input jumlah barang A
    // Input jumlah barang B
    // double jumlahBarangA, jumlahBarangB, hargaBarangA, hargaBarangB, diskonA, diskonB, totalBarangA, diskonBarangA, hargaAkhirA, totalBarangB, diskonBarangB, hargaAkhirB, totalBayar
    // Calculate TotalBarangA = jumlahBarangA * 1000
    // Calculate DiskonA = 0.10 * TotalBarangA
    // Calculate HargaAkhirA = TotalBarangA - DiskonA
    // Calculate TotalBarangB = jumlahBarangB * 2000
    // Calculate DiskonB = 0.05 * TotalBarangB
    // Calculate HargaAkhirB = TotalBarangB - DiskonB
    // Calculate TotalBayar = HargaAkhirA + HargaAkhirB
    // Output TotalBayar
// End



public class TotalBayarPembelian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah barang A
        System.out.print("Masukkan jumlah barang A: ");
        int jumlahBarangA = scanner.nextInt();
        
        // Input jumlah barang B
        System.out.print("Masukkan jumlah barang B: ");
        int jumlahBarangB = scanner.nextInt();
        
        // Harga dan diskon barang
        double hargaBarangA = 1000;
        double diskonA = 0.10;  // Diskon 10%
        double hargaBarangB = 2000;
        double diskonB = 0.05;  // Diskon 5%
        
        // Menghitung total harga barang A sebelum diskon
        double totalBarangA = jumlahBarangA * hargaBarangA;
        
        // Menghitung diskon dan harga akhir barang A
        double diskonBarangA = totalBarangA * diskonA;
        double hargaAkhirA = totalBarangA - diskonBarangA;
        
        // Menghitung total harga barang B sebelum diskon
        double totalBarangB = jumlahBarangB * hargaBarangB;
        
        // Menghitung diskon dan harga akhir barang B
        double diskonBarangB = totalBarangB * diskonB;
        double hargaAkhirB = totalBarangB - diskonBarangB;
        
        // Menghitung total bayar
        double totalBayar = hargaAkhirA + hargaAkhirB;
        
        // Output total bayar
        System.out.println("Total bayar: Rp" + totalBayar);
        
        scanner.close();
    }
}
