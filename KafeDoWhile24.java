import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, totalHarga = 0, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi di batalkan");
                break;
            }

            System.out.print("Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Jumlah roti : ");
            roti = sc.nextInt();
            System.out.print("Jumlah teh : ");
            teh = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Tota yang harus di bayar : " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Transaksi selesai!!");
    }
}
