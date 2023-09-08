import java.util.Scanner;

// Definisikan kelas PersegiPanjang terlebih dahulu
class PersegiPanjang2 {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan panjang array: ");
        int length = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[length];

        // ppArray[0] = new PersegiPanjang();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;

        // ppArray[1] = new PersegiPanjang();
        // ppArray[1].panjang = 80;
        // ppArray[1].lebar = 40;

        // ppArray[2] = new PersegiPanjang();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjangh ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        // System.out.println("Persegi Panjang ke-0, panjang " + ppArray[0].panjang + ",
        // lebar: " + ppArray[0].lebar);
        // System.out.println("Persegi Panjang ke-1, panjang " + ppArray[1].panjang + ",
        // lebar: " + ppArray[1].lebar);
        // System.out.println("Persegi Panjang ke-2, panjang " + ppArray[2].panjang + ",
        // lebar: " + ppArray[2].lebar);

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke -" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

    }

}
