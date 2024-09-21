import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        int angka;
        int temp=1;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        angka = s.nextInt();
        for (int i = angka; i >=1; i--) {
            System.out.print(i+" x ");
            temp *=i;
        }
        System.out.println();
        System.out.println("Total Faktorial: "+temp);
        s.close();
    }
    
}
