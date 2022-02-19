import java.util.Arrays;
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        /// Identitas ///
        System.out.println("Andika Setya Eka Natha");
        System.out.println();
        System.out.println("10 PPLG 1");
        System.out.println();
        System.out.println("07");
        System.out.println();

        System.out.println("###### Input Siswa Yang Absen ######");

        /// String ///
        String[] Teman = new String[5];

        /// Scanner ///
        Scanner scan = new Scanner(System.in);

        /// Input Array ///
        for (int i=1; i<Teman.length; i++ ) {
            System.out.println("Teman ke- " +i+ ":");
            Teman[i] = scan.nextLine();
        }

        /// Output Array ///
        System.out.println();
        System.out.println("###### Absensi Siswa ######");
        System.out.println();


        for (String x: Teman) {
            System.out.println("");

        }
    }
}
