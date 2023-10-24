public class Stack {
    int size;
    int top;
    Struk[] data;

    public Stack(int size) {
        this.size = size;
        data = new Struk[size];
        top = -1;
    }

    public boolean IsEmpty() {
        return top == -1;
    }

    public boolean IsFull() {
        return top == size - 1;
    }

    public void push(Struk struk) {
        if (!IsFull()) {
            top++;
            data[top] = struk;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            Struk x = data[top];
            top--;
            System.out.println("Struk yang keluar: ");
            System.out.println("---------------------------------------------------------");
            System.out.println("| No. Transaksi | Tanggal Pembelian | Jumlah Barang | Total Bayar |");
            System.out.println("---------------------------------------------------------");
            System.out.println("| " + x.noTrk + "           | " + x.tglBeli + "      | " + x.jmlBarang + "              | " + x.totalBayar + "     |");
            System.out.println("---------------------------------------------------------");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen teratas: " + data[top].noTrk + " " +
                    data[top].tglBeli + " " + data[top].jmlBarang + " " + data[top].totalBayar);
        } else {
            System.out.println("Stack kosong");
        }
    }

    public void print() {
        if (!IsEmpty()) {
            System.out.println("Isi struk: ");
            for (int i = top; i >= 0; i--) {
                System.out.println("---------------------------------------------------------");
                System.out.println("| No. Transaksi | Tanggal Pembelian | Jumlah Barang | Total Bayar |");
                System.out.println("---------------------------------------------------------");
                System.out.println("| " + data[i].noTrk + "           | " + data[i].tglBeli + "      | " + data[i].jmlBarang + "              | " + data[i].totalBayar + "     |");
                System.out.println("---------------------------------------------------------");
            }
            System.out.println("");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            top = -1; // Set top ke -1 untuk mengosongkan stack
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}