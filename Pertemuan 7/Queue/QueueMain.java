import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        menu(); // Call the menu function from the main method.
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);

        int pilih;

        do {
            System.out.println("Pilih menu:");
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Cek antrian terdepan");
            System.out.println("4. Cek semua antrian ");
            System.out.println("5. Exit");
            System.out.println("-----------------------------");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kota Asal: ");
                    String asal = sc.nextLine();
                    System.out.print("Kota Tujuan: ");
                    String tujuan = sc.nextLine();
                    System.out.print("Jumlah Tiket: ");
                    int jml = sc.nextInt();
                    System.out.print("Harga: ");
                    int hrg = sc.nextInt();
                    Penumpang p = new Penumpang(nama, asal, tujuan, jml, hrg);
                    sc.nextLine();
                    antri.Enqueue(p);
                    break;


                case 2:
                   Penumpang data = antri.Dequeue();
                   if (!"".equals(data.nama) && !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan) && data.jumlahTiket != 0 && data.harga != 0) {
                    System.out.println("Antrian yang keluar: " + data.nama + " " + data.kotaAsal + " " + data.kotaTujuan + " " + data.jumlahTiket + " " + data.harga);
                   }
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                case 5:
                antri.clear();
                   break;
           
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilih != 5); // Continue the loop until the user chooses to exit (option 6).
    }
}


