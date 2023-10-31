public class DLL {
   Vaksin head, tail;
    int size;

    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(int antrian, String nama) {
        Vaksin newVaksin = new Vaksin(nama, antrian);
        if (isEmpty()) {
            head = newVaksin;
            tail = newVaksin;
        } else {
            tail.next = newVaksin;
            newVaksin.prev = tail;
            tail = newVaksin;
        }

        size++;
    }

    public void dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }

        Vaksin temp = head;
        head = head.next;
       
        size--;

        if (isEmpty()) {
            tail = null;
        }

        System.out.println(temp.nama + " telah selesai divaksinasi.");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Vaksin current = head;
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("No.  | Nama            |");
            int i = 1;
            while (current != null) {
                System.out.printf("%-4d | %-15s |\n", i, current.nama);
                current = current.next;
                i++;
            }
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Sisa Antrian: " + size);
 }
}
}
