import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai = 0, tertinggi = 0, terendah = 100, lulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke " + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }else{
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus += 1;
            }
        }

        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Mahasiswa Yang lulus : " + lulus);
    }
}