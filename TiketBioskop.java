
import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTiket, hargaTiket = 50000, totalTiket = 0;
        double diskon, total, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid!");
                continue;
            }

            diskon = 0;
            total = hargaTiket * jmlTiket;

            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }

            total = total - (total * diskon);

            totalTiket += jmlTiket;
            totalPenjualan += total;

            System.out.println("Jumlah tiket: " + jmlTiket);
            System.out.println("Total harga setelah diskon: Rp" + (int) total);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + (int) totalPenjualan);
    }
}
