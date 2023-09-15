import java.util.Scanner;

public class KandidatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.print("Masukkan Jumlah Vote= ");
        int totElemen = sc.nextInt();
        Kandidat jbs = new Kandidat(totElemen);
        jbs.elemen = totElemen;

        System.out.println("===========================================");
        for (int i = 0; i < jbs.elemen; i++) {
            System.out.print("Masukkan Nama Kandidat yang dipilih - " + (i + 1) + " = ");
            jbs.name[i] = sc.next();
        }

        System.out.println("===========================================");
        System.out.println("Algorithm DC");
        System.out.println("Kandidat yang di pilih paling banyak: " 
                + jbs.totalDC(jbs.name, 0, jbs.elemen -1));
        System.out.println("Pemenang dari pemilihan adalah : " + jbs.getWinner());
    }
}
