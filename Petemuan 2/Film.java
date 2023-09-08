
public class Film {
    public String judul; // title
    public String genre; // genre
    public String rate; // rating
    public int jumlahTiket; // number of tickets
    public int hargaTiket; // ticket price

    Film() {
    }

    Film (String jd, String gr, String rt, int jt, int ht) {
        judul = jd;
        genre = gr;
        rate = rt;
        jumlahTiket = jt;
        hargaTiket = ht;
    }

    public void tambahTiket(int jumlah) {
        jumlahTiket += jumlah;
    }

    public void kurangiTiket(int jumlah) {
        if (jumlah <= jumlahTiket) {
            jumlahTiket -= jumlah;
        } else {
            System.out.println("Tidak dapat mengurangi tiket lebih dari jumlah yang tersedia.");
        }
    }

    public void tampilFilm() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rate);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Harga Tiket: " + hargaTiket);
    }

    public int totalRevenue(int jumlahTiketTerjual) {
        return jumlahTiketTerjual * hargaTiket;
    }
}
