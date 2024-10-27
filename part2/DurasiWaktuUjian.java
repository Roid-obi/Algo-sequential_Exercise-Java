package part2;

import java.util.Scanner;

// Pseudocode
// Start
    // int hourStart, minuteStart, secondStart
    // int hourEnd, minuteEnd, secondEnd
    // input hourStart, minuteStart, secondStart
    // input hourEnd, minuteEnd, secondEnd

    // If secondEnd < secondStart
    // secondEnd += 60
    // minuteEnd -= 1

    // If minuteEnd < minuteStart
    // minuteEnd += 60
    // hourEnd -= 1

    // calculateDurationHour = hourEnd - hourStart
    // calculateDurationMinute = minuteEnd - minuteStart
    // calculateDurationSecond = secondEnd - secondStart

    // Menampilkan durasi dalam jam, menit, dan detik
// End

public class DurasiWaktuUjian {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jamMulai, menitMulai, detikMulai;
        int jamAkhir, menitAkhir, detikAkhir;
        int durasiJam, durasiMenit, durasiDetik;

        // Input waktu mulai ujian
        System.out.print("Masukkan waktu mulai ujian (format Jam:Menit:Detik): ");
        String[] waktuMulai = input.nextLine().split(":");
        jamMulai = Integer.parseInt(waktuMulai[0]);
        menitMulai = Integer.parseInt(waktuMulai[1]);
        detikMulai = Integer.parseInt(waktuMulai[2]);

        // Input waktu akhir ujian
        System.out.print("Masukkan waktu akhir ujian (format Jam:Menit:Detik): ");
        String[] waktuAkhir = input.nextLine().split(":");
        jamAkhir = Integer.parseInt(waktuAkhir[0]);
        menitAkhir = Integer.parseInt(waktuAkhir[1]);
        detikAkhir = Integer.parseInt(waktuAkhir[2]);

        // Menghitung durasi detik
        if (detikAkhir < detikMulai) {
            detikAkhir += 60; // Menambah 60 detik
            menitAkhir--; // Mengurangi 1 menit
        }
        durasiDetik = detikAkhir - detikMulai;

        // Menghitung durasi menit
        if (menitAkhir < menitMulai) {
            menitAkhir += 60; // Menambah 60 menit
            jamAkhir--; // Mengurangi 1 jam
        }
        durasiMenit = menitAkhir - menitMulai;

        // Menghitung durasi jam
        durasiJam = jamAkhir - jamMulai;

        // Menampilkan hasil
        System.out.println("Durasi ujian: " + durasiJam + " jam, " + durasiMenit + " menit, " + durasiDetik + " detik");

        input.close();
    }
}