import java.util.Scanner;

public class progamParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukan Jenis : ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukan durasi : ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } 
                
                if(jenis == 2) {
                    total += durasi * 2000;
                }
            }

            System.out.println("Total : " + total);
            total = 0;
        } while (jenis != 0);
    }
}
