import java.util.Scanner;

public class NasabahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nasabah baru yang ingin ditambahkan : ");
        int length = sc.nextInt();
        Nasabah nasabahArray[] = new Nasabah[length];

        for (int i = 0; i < nasabahArray.length; i++) {
            System.out.println("--- DATA NASABAH " + (i + 1));
            System.out.print("Masukkan id nasabah = ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nama nasabah = ");
            String namaNasabah = sc.nextLine();
            System.out.print("Masukkan alamat nasabah = ");
            String alamat = sc.nextLine();
            System.out.print("Masukkan nomor tlf nasabah (62...) = ");
            int noHP = sc.nextInt();
            nasabahArray[i] = new Nasabah(id, namaNasabah, alamat, noHP);
            System.out.println("===========================");
            System.out.println("=============PROSES========");
            System.out.println("===========================");
            nasabahArray[i].statusAktif = true;

        }

        boolean menu = true;
        while (menu) {
            System.out.println("=== NASABAH BERHASIL DITAMBAHKAN ===");
            System.out.println("MENU");
            System.out.println("1. Lihat daftar nasabah");
            System.out.println("2. Akses account nasabah");
            System.out.println("3. Exit");
            System.out.print("Pilih menu : ");
            int pilihMenu = sc.nextInt();

            switch (pilihMenu) {
                case 1:
                    System.out.println("---- Daftar nasabah ----");
                    for (int i = 0; i < nasabahArray.length; i++) {
                        System.out.println("Data nasabah " + (i + 1) + " " + nasabahArray[i].nama);
                    }
                    break;
                    
                case 2:
                    System.out.print("Masukkan id nasabah = ");
                    int id = sc.nextInt();
                    for (int i = 0; i < nasabahArray.length; i++) {
                        if (id == nasabahArray[i].id) {
                            int indexNasabah = i;
                            boolean menuNasabah = true;
                            while (menuNasabah) {
                                System.out.println("Nasabah ditemukan!");
                                System.out.println("MENU NASABAH");
                                System.out.println("1. Lihat saldo");
                                System.out.println("2. Menabung");
                                System.out.println("3. Tarik tunai");
                                System.out.println("4. NJALUK UTANG");
                                System.out.println("5. CEK HUTANG");
                                System.out.println("6. BAYAR CICILAN");
                                System.out.println("7. Buka rekening");
                                System.out.println("8. Tutup rekning");
                                System.out.println("9. Kembali ke menu utama");
                                System.out.print("PILIH MENU :");
                                int pilihMenuNasabah = sc.nextInt();
                                switch (pilihMenuNasabah) {
                                    case 1:
                                        int saldoNasabah = nasabahArray[i].lihatSaldo();
                                        if (saldoNasabah == -1) {
                                            System.out.println("Mohon buka rekening terlebih dahulu");
                                        } else {
                                            System.out.println("Saldo nasabah " + nasabahArray[i].nama + " "
                                                    + "sejumlah " + saldoNasabah);
                                        }
                                        break;
                                    case 2:
                                        System.out.print("masukkan jumlah yang ingin ditabung = ");
                                        int tabung = sc.nextInt();
                                        nasabahArray[i].menabung(tabung);
                                        System.out.println("Berhasil menabung");
                                        break;
                                    case 3:
                                        System.out.print("Jumlah yang ingin ditarik = ");
                                        int tarik = sc.nextInt();
                                        nasabahArray[i].tarikTunai(tarik);
                                        System.out.println("berhasil tarik tunai, saldo anda sekarang " + nasabahArray[i].saldo);
                                        break;
                                    case 4:
                                        System.out.print("Berapa jumlah uang yang ingin anda hutang = ");
                                        int utang = sc.nextInt();
                                        nasabahArray[i].berhutang(utang);
                                        break;
                                    case 5:
                                        System.out.println("PELANGGAN YANG TERHORMAT ATAS NAMA " + nasabahArray[i].nama);
                                        System.out.println("Jumlah hutang anda adalah " + nasabahArray[i].jmlhHutang);
                                        break;
                                    case 6:
                                        System.out.println("CICILAN UNTUK ATAS NAMA " + nasabahArray[i].nama);
                                        System.out.println("Sejumlah = " + nasabahArray[i].cicilan());
                                        System.out.print("Apakah anda ingin membayar cicilan bulan ini ? (y/n) ");
                                        String yesNo = sc.nextLine();
                                        sc.nextLine();
                                        if (yesNo.equalsIgnoreCase("Y")) {
                                            float cicilan = nasabahArray[i].cicilan();
                                            nasabahArray[i].bayarCicilan(cicilan);
                                        }
                                        System.out.println("Jumlah hutang anda saat ini adalah " + nasabahArray[i].jmlhHutang);
                                        break;
                                    case 7:
                                        nasabahArray[i].bukaRekening();
                                        System.out.println("SELAMAT AKUN ANDA BERHASIL DIAKTIFKAN!!");
                                        break;
                                    case 8:
                                        System.out.print("APAKAH ANDA YAKIN INGIN MENUTUP REKENING ? (Y/N)");
                                        String pilihan = sc.nextLine();
                                        if (pilihan.equalsIgnoreCase("Y")) {
                                            nasabahArray[i].tutupRekening();
                                        } else {
                                            System.out.println("OKELAH!!");
                                        }
                                        break;
                                    case 9:
                                        System.out.println("RECEH BOS");
                                        menuNasabah = false;
                                        break;
                                }
                            }
                        } else {
                            System.out.println("nasabah tidak ditemukan");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Semangat nabungnya, anda nabung kami kaya");
                    menu = false;
                    break;
            }
        }
    }
}
