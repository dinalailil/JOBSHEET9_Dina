import java.util.Scanner;
public class ArrayNilai09Modifikasi {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.println("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-"+i+" LULUS!");
            }
         }
         for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] < 70){
                System.out.println("Mahasiswa ke-"+i+" TIDAK LULUS!");
            }
        }    
    }
}