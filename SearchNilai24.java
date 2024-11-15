import java.util.Scanner;
public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int j = sc.nextInt();

        int [] arrNilai = new int [j];

        for (int i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " :");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < arrNilai.length; i++){
            if (arrNilai[i] == key){
                ditemukan = true;
                posisi = i +1;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + posisi);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan"); 

        }
        
    }
}
