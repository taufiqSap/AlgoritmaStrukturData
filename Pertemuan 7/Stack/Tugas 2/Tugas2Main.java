import java.util.Scanner;

public class Tugas2Main {
    public static void main(String[] args) {
        Stack st = new Stack(8);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        char pilih;
        do {
            System.out.print("Nomor transaksi: ");
            int nt = sc.nextInt();
            System.out.print("Tanggal pembelian: ");
            String tglBeli = sc1.nextLine();
            System.out.print("Jumlah barang yang dibeli: ");
            int jmlBarang = sc.nextInt();
            System.out.print("Total harga bayar: ");
            int totalBayar = sc.nextInt();

            Struk str = new Struk(nt, tglBeli, jmlBarang, totalBayar);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(str);
        } while (pilih == 'y');

        st.print();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        
        st.print();

        sc.close();
        sc1.close();
    }
 
    
}
