import java.util.Scanner;

public class Tugas3Individu09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array:");
        int BanyakElemen = sc.nextInt();

        int[] arrayInt = new int[BanyakElemen];

        for (int i = 0; i < BanyakElemen; i++) {
            System.out.println("Masukkan elemen array ke-" + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();;
        }

        int nilaiTertinggi = arrayInt[0];
        int nilaiTerendah = arrayInt[0];
        int total = arrayInt[0];

        for (int i = 1; i < BanyakElemen; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }

            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }

            total += arrayInt[i];
        }

        double rataRata = (double) total / BanyakElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
