import java.util.Arrays;
import java.util.Scanner;

public class LatihanArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int jumlah ;
        System.out.println("Jumlah SIswa Yang Mengikuti Ekstrakulikuler : ");
        jumlah = input.nextInt();
        String[] siswa = new String[jumlah];

        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Masukkan Nama Siswa : ");
            String siswaku = input2.nextLine();
            siswa[i] = siswaku;
        }

        Arrays.sort(siswa);
        System.out.println ("// Siswa Yang Mengikuti Ekstra //");
        for (String siswaIkut : siswa) {
            System.out.println("Siswa Yang Mengikuti Kegiatan Ekstrakulikuler : " + siswaIkut);
        }


    }

}
