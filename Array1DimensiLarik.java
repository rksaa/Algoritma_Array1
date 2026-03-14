/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Riksa Siddiq Alrizki
 */
public class Array1DimensiLarik {
    public static void main(String[] args) {

        // ================================================
        // 1. DEKLARASI & INISIALISASI ARRAY
        // ================================================
        // Cara 1: Langsung isi nilai
        int[] iq = {110, 125, 98, 135, 107};

        // Cara 2: Tentukan ukuran dulu, lalu isi manual
        String[] namaSiswa = new String[5];
        namaSiswa[0] = "Andi";
        namaSiswa[1] = "Budi";
        namaSiswa[2] = "Citra";
        namaSiswa[3] = "Dian";
        namaSiswa[4] = "Eka";

        // ================================================
        // 2. MENAMPILKAN ISI ARRAY (for biasa)
        // ================================================
        System.out.println("===== DAFTAR IQ SISWA =====");
        for (int i = 0; i < iq.length; i++) {
            System.out.println("IQ ke-" + (i + 1) + " [" + namaSiswa[i] + "] = " + iq[i]);
        }

        // ================================================
        // 3. MENAMPILKAN ISI ARRAY (for-each) -> lebih simpel
        // ================================================
        System.out.println("\n===== SEMUA IQ (for-each) =====");
        for (int n : iq) {
            System.out.print(n + " ");
        }

        // ================================================
        // 4. MENCARI IQ TERTINGGI & TERENDAH
        // ================================================
        int tertinggi = iq[0];
        int terendah  = iq[0];

        for (int i = 1; i < iq.length; i++) {
            if (iq[i] > tertinggi) tertinggi = iq[i];
            if (iq[i] < terendah)  terendah  = iq[i];
        }

        System.out.println("\n\n===== STATISTIK =====");
        System.out.println("IQ Tertinggi : " + tertinggi);
        System.out.println("IQ Terendah  : " + terendah);

        // ================================================
        // 5. MENGHITUNG RATA-RATA IQ
        // ================================================
        int total = 0;
        for (int n : iq) {
            total += n;
        }
        double rataRata = (double) total / iq.length;
        System.out.println("Rata-rata IQ : " + rataRata);

        // ================================================
        // 6. MENGUBAH IQ DI INDEKS TERTENTU
        // ================================================
        iq[2] = 105; // Ganti IQ indeks ke-2 (Citra) dari 98 → 105
        System.out.println("\n===== SETELAH IQ CITRA DIUBAH =====");
        System.out.println("IQ Citra (indeks 2) = " + iq[2]);
    }
}
