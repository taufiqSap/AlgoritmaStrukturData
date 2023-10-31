import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DLL queue = new DLL();

        Scanner scanner = new Scanner(System.in);

        int pilihan = -1;
        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Pilihan: ");

            try {
                pilihan = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Masukkan pilihan dalam bentuk angka.");
                scanner.next();
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Data Penerima Vaksin\nNomor Antrian: ");
                    int noAntrian;
                    while (true) {
                        try {
                            noAntrian = scanner.nextInt();
                            break;
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Masukkan Nomor Antrian dalam bentuk angka.");
                            scanner.next();
                        }
                    }
                    System.out.print("Nama Penerima: ");
                    String nama = scanner.next();
                    queue.enqueue(noAntrian, nama);
                    break;
                case 2:
                    try {
                        queue.dequeue();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan!=4);
}
}
