import java.util.Scanner;

public class DeretAritmatika {
    public static void main(String[] args) {
        int batasAwal, batasAkhir, beda, pilihan;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Batas Awal: ");
        batasAwal = s.nextInt();
        System.out.println("Masukkan Batas Akhir: ");
        batasAkhir = s.nextInt();
        System.out.println("Masukkan Nilai Beda: ");
        beda = s.nextInt();
        System.out.println("Masukkan Pilihan Loop 1 Atau 2: ");
        pilihan = s.nextInt();

        if (pilihan == 1) {
            // perulangan for
            System.out.println("Deret Aritmatika: ");
            for (int i = batasAwal; i <= batasAkhir; i += beda) {
                System.out.print(i + " ");
            }
        } else if (pilihan == 2) {
            // perulangan while
            System.out.println("Deret Aritmatika: ");
            int i = batasAwal;
            while (i <= batasAkhir) {
                System.out.print(i + " ");
                i += beda;
            }
        } else {
            System.out.println("Pilihan Tidak Ditemukan");
        }
        s.close();

    }
}
