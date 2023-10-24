

import java.util.Scanner;
public class StackBukuMain{



    public static void main(String[] args) {
        Stack st = new Stack(8);
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
        System.out.println("Pilih menu");
        System.out.println("1. Operasi push");
        System.out.println("2. Operasi pop");
        System.out.println("3. Operasi peek");
        System.out.println("4. Operasi print");
        System.out.println("5. Keluar");
        menu = sc.nextInt();
            switch(menu) {
                case 1 :
                    System.out.println("Tambahkan data buku");
                    char pilih;
                    do {
                        System.out.print("Judul: ");
                        String judul = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Nama Pengarang: ");
                        String nama = sc.nextLine();
                        System.out.print("Tahun Terbit: ");
                        int tahun = sc.nextInt();
                        System.out.print("Jumlah Halaman: ");
                        int jml = sc.nextInt();
                        System.out.print("Harga: ");
                        int hrg = sc.nextInt();

                        Buku bk = new Buku(judul, nama, tahun, jml, hrg);
                        System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        st.push(bk);
                    } while (pilih == 'y');
                    break;
                
                case 2: 
                    System.out.println("Mengeluarkan data");
                    st.pop();
                    break;
                
                case 3: 
                    System.out.println("Melihat data teratas");
                    st.peek();
                    break;
                
                case 4: 
                    System.out.println("Meanmpilkan data");
                    st.print();
                    break;

                case 5:
                    System.out.println("Akan keluar menu");
                    break;
                
                default:
                    System.out.println("Tidak ada opsi");
        }
    } while(menu != 5);

        /*char pilih;
        do {
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Nama Pengarang: ");
            String nama = sc.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahun = sc.nextInt();
            System.out.print("Jumlah Halaman: ");
            int jml = sc.nextInt();
            System.out.print("Harga: ");
            int hrg = sc.nextInt();

            Buku bk = new Buku(judul, nama, tahun, jml, hrg);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
        } while (pilih == 'y');

        }

        st.print();
        st.pop();
        st.peek();
        st.print();*/
           
        sc.close();
    }
}



