import java.util.Scanner;

public class Tugas4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah penduduk: ");
        int n = sc.nextInt();
        Tugas4[] tgs = new Tugas4[n];
        for (int i = 0; i < tgs.length; i++) {
            System.out.println("Penduduk ke-"+(i+1));
            System.out.print("NIK: ");
            String NIK = sc.next();
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Alamat: ");
            String Alamat = sc.next();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = sc.next();
            tgs[i] = new Tugas4(NIK, nama, Alamat, jenisKelamin);
            System.out.println();
        }
        tgs[n-1].tampilkan(tgs);
        System.out.println();
        System.out.println("--- CARI DATA PENDUDUK ---");
        System.out.print("Masukkan NIK data yang dicari: ");
        String nik = sc.next();
        tgs[n-1].cari(nik, tgs);
    }
}