public class Tugas4 {

    public String NIK;
    public String nama;
    public String Alamat;
    public String jenisKelamin;

    Tugas4(String NIK, String nama, String Alamat, String jenisKelamin) {
        this.NIK = NIK;
        this.nama = nama;
        this.Alamat = Alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public void cari(String key, Tugas4 arr[]) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (key.equalsIgnoreCase(arr[i].NIK)) {
                System.out.printf("%-10d %-15s %-15s %-15s %-15s\n", (i + 1), arr[i].NIK, arr[i].nama, arr[i].Alamat,
                        arr[i].jenisKelamin);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void tampilkan(Tugas4 arr[]) {
        System.out.println("--- DATA PENDUDUK ---");
        System.out.println("NO         NIK             NAMA            ALAMAT          JENIS KELAMIN");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-15s %-15s\n", (i + 1), arr[i].NIK, arr[i].nama, arr[i].Alamat,
                    arr[i].jenisKelamin);
        }
    }

}