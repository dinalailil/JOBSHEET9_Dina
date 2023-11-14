import java.util.Scanner;
public class ArrayRataNilai09Modifikasi {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jumlahMhs;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2Lulus;
        double rata2TidakLulus;
        int LULUS = 0;
        int TIDAKLULUS = 0;

        System.out.println("Masukkan Jumlah Mahasiswa");
        jumlahMhs = sc.nextInt();
        int [] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i <nilaiMhs.length; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) +" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] >70) {
                totalLulus += nilaiMhs[i];
                LULUS++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                TIDAKLULUS++;
            }
        }
        rata2Lulus = LULUS > 0 ? totalLulus / LULUS : 0;
        rata2TidakLulus = TIDAKLULUS > 0 ? totalTidakLulus / TIDAKLULUS : 0;
        
        System.out.println("Rata-rata nilai lulus ="+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        }
    }
