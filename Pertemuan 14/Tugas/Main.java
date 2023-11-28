import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashTable mahasiswaTable = new HashTable();

        while (true) {
            System.out.println("1 Tambah mahasiswa");
            System.out.println("2 Cari mahasiswa");
            System.out.println("3 Hapus mahasiswa");
            System.out.println("4 Cari NIM");
            System.out.println("5 exit");
            System.out.print("Pilih 1-5 : ");
            int pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nTambah Mahasiswa:");
                    System.out.print("NIM: ");
                    scan.nextLine(); // consume the newline character
                    String tambahNim = scan.nextLine();
                    System.out.print("Nama Lengkap: ");
                    String tambahNama = scan.nextLine();
                    System.out.print("Jurusan: ");
                    String tambahJurusan = scan.nextLine();
                    System.out.print("Program Studi: ");
                    String tambahProdi = scan.nextLine();

                    Mahasiswa mahasiswaTambah = new Mahasiswa(tambahNim, tambahNama, tambahJurusan, tambahProdi);
                    mahasiswaTable.set(tambahNim, mahasiswaTambah); // Use set instead of tambahMahasiswa
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\nCari Mahasiswa:");
                    System.out.print("Masukkan NIM: ");
                    scan.nextLine(); // consume the newline character
                    String nimCari = scan.nextLine();

                    Mahasiswa mahasiswaCari = mahasiswaTable.get(nimCari); // Use get instead of cariMahasiswa
                    if (mahasiswaCari != null) {
                        System.out.println("Mahasiswa ditemukan:");
                        System.out.println("NIM: " + mahasiswaCari.getNim());
                        System.out.println("Nama Lengkap: " + mahasiswaCari.getNamaLengkap());
                        System.out.println("Jurusan: " + mahasiswaCari.getJurusan());
                        System.out.println("Program Studi: " + mahasiswaCari.getProgramStudi());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.println("\nHapus Mahasiswa:");
                    System.out.print("Masukkan NIM: ");
                    scan.nextLine(); // consume the newline character
                    String nimHapus = scan.nextLine();
                    mahasiswaTable.remove(nimHapus); // Use remove instead of hapusMahasiswa
                    System.out.println("Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus (jika ada).");
                    break;

                case 4:
                    System.out.println("\nNIM Mahasiswa yang Tersimpan:");
                    System.out.println(mahasiswaTable.getNIMMahasiswa());
                    break;

                case 5:
                    System.out.println("Program selesai. Sampai jumpa!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid. Silakan pilih kembali.");
            }
        }
    }
}
