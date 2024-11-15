import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int j = sc.nextInt();

        int [] nilaiMhs = new int [j];
        double totallulus = 0, totaltidaklulus = 0;
        //double rata2;
        int lulus = 0, tidaklulus = 0;

    
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " :");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70){
                totallulus += nilaiMhs[i];
                lulus++;
            }
            else {
                totaltidaklulus += nilaiMhs[i];
                tidaklulus++;
            }
            
        }

        //rata2 = total/nilaiMhs.length;
        //System.out.println("Rata-rata nilai = " + rata2);
        double ratalulus = (lulus > 0) ? totallulus / lulus : 0;
        double ratatidaklulus = (tidaklulus > 0) ? totaltidaklulus / tidaklulus : 0;
        System.out.println("Rata-rata nilai lulus = " + ratalulus );
        System.out.println("Rata-rata nilai tidak lulus = " + ratatidaklulus);


    }
}
