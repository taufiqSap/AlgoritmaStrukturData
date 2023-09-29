public class Tugas1main {
    public static void main(String[] args) {
        int[] data = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        Tugas1 tgs = new Tugas1(data);
        System.out.println("Isi elemen array: ");
        tgs.tampilkan();
        int x = 41;
        int index = tgs.cari(x);
        tgs.temukan(x, index);
        x = 50;
        index = tgs.cari(x);
        tgs.temukan(x, index);
    }
}
    

