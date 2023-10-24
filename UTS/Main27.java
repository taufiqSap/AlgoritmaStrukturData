import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        System.out.println("Dibuat Oleh : Taufiq Striaji Ariya ");
        System.out.println("NIM : 2241760142 ");
        System.out.println("Absen : 27  ");
        System.out.println("=========================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        int pilih;
        Scanner input = new Scanner(System.in);
        Queue27 q = new Queue27(20);
        Pesanan27[] data = new Pesanan27[20];
        int kodePesananCounter = 1;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nomor Antrian: ");
                    String noAntrian = input.nextLine();
                    System.out.print("Masukkan nama pembeli: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String noTelp = input.nextLine();
                    Pembeli27 pembeli = new Pembeli27(nama, noTelp, noAntrian);
                    q.Enqueue(pembeli);
                    break;
                case 2:
                    q.print();
                    break;
                case 3:
                    q.Dequeue();
                    System.out.println("--- Transaksi Pesanan ---");
                    System.out.print("Masukkan nomor pesanan: ");
                    int kodePesanan = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan nama pesanan: ");
                    String namaPesanan = input.nextLine();
                    System.out.print("Masukkan harga pesanan: ");
                    int harga = input.nextInt();
                    input.nextLine();
                    Pesanan27 pesanan = new Pesanan27(kodePesanan, namaPesanan, harga);
                    q.addPesanan(pesanan);
                    q.printPesanan();
                    break;
                case 4:
                    q.sort(data);
                    q.printPesanan();
                    break;
                case 5:
                    System.out.println("Total Pendapatan: " + q.totalPendapatan());
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
}
