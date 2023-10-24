public class Queue {
    int max, size;
    int front, rear;
    Penumpang[] Q;

    public Queue(int n){
        max = n;
        Create();
    }

    public void  Create(){
        Q = new Penumpang[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty(){
        if (size == 0){
            return true;

        } else {
            return false;
        }
    }
    public boolean isFull(){
        if(size == max){
            return true;
        } else {
            return false;

        }
    }

    public void peek (){
        if(!isEmpty()){
            System.out.println("Elemen terdepan: " + Q[front].nama + " " + Q[front].kotaAsal + " " + Q[front].kotaTujuan + " " + Q[front].jumlahTiket + " " + Q[front].harga);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print (){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else{
            int i = front;
            while(i != rear) {
                System.out.print(Q[i].nama + " " + Q[i].kotaAsal + " " + Q[i].kotaTujuan + " " + Q[i].jumlahTiket + " " + Q[i].harga );
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear (){
     if (isEmpty()){
        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");
     }   else{
        System.out.println("Queue masih kosong");
     }

    }

    public void Enqueue(Penumpang data) {
        if(isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()){
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else{
                    rear++;
                }
            }
        }
        Q[rear] = data;
        size++;
    }
    public Penumpang Dequeue(){
        Penumpang data = new Penumpang("", "", "", 0, 0);
        if(isEmpty()){
            System.out.println("Queue kosong");
    } else{
        data  = Q[front];
        size --;
        if(isEmpty()){
            front = rear -1;
        } else{
            if (front == max -1){
                front = 0;
            } else{
                front ++;
            }
        }
    } 
    return data;
    }
    
}
