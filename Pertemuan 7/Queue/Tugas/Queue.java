

public class Queue {
    int max, size, front, rear;
    Mahasiswa[] antrian;

    public Queue(int max) {
        this.max = max;
        Create();
    }

    public void Create() {
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Mahasiswa data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else  {
                    rear++;
                }
            }
            antrian[rear] = data;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen 
                    + " " + antrian[i].ipk);
                i = (i + 1) % max;
                System.out.println("");
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen 
                    + " " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nim + " " + antrian[front].nama
                + " " + antrian[front].absen + " " + antrian[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear].nim + " " + antrian[rear].nama
                + " " + antrian[rear].absen + " " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nim) {
        if (!IsEmpty()) {
            for (int i = 0; i < antrian.length; i++) {
                if(antrian[i].nim.equals(nim)) {
                    System.out.println("Mahasiswa dengan NIM " + nim + " berada pada indeks ke-" + i);
                }
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void printMahasiswa(int posisi) {
        if (!IsEmpty()) {
            for (int i = 0; i < antrian.length; i++) {
                if(posisi == i) {
                System.out.println("Mahasiswa pada posisi/indeks ke-" + posisi + ": " 
                + antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
                }
            }

        } else {
            System.out.println("Queue masih kosong"); 
        }
    }
}
