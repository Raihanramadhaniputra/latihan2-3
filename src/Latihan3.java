
public class Latihan3 {
    public static void main(String[] args) {

        // 1. Data nilai mahasiswa
        int[] nilai = {85, 70, 92, 60, 78};

        // 2. Inisialisasi total dan nilai tertinggi
        int total = 0;
        int maks = nilai[0];

        // 3. Menghitung total dan mencari nilai tertinggi
        for (int n : nilai) {
            total += n;

            if (n > maks) {
                maks = n;
            }
        }

        // 4. Menghitung rata-rata
        double rata = (double) total / nilai.length;

        // 5. Menentukan predikat
        String pred;

        if (rata >= 80) {
            pred = "A";
        } else if (rata >= 70) {
            pred = "B";
        } else if (rata >= 60) {
            pred = "C";
        } else {
            pred = "D";
        }

        // 6. Menampilkan hasil
        System.out.println("Total Nilai  : " + total);
        System.out.println("Rata-rata    : " + rata);
        System.out.println("Nilai Tertinggi : " + maks);
        System.out.println("Predikat     : " + pred);
    }
}
