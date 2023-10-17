public class SingleLinkedList {

    Node head; // posisi awal linked list
    Node tail; // posisi akhir linked list

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong!");
        }
    }

    public void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // jika linked list kosong
            head = ndInput; // head and tail sama dengan node input
            tail = ndInput;
        } else {
            ndInput.next = head; // next dari node baru adalah head lama
            head = ndInput;
        }
    }

    public void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {// jika linked list kosong
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(int key, int input){
        Node ndInput = new Node(input,null);
            Node temp = head;
            do{
                if(temp.data == key){
                    ndInput.next = temp.next;
                    if(ndInput.next==null) tail =ndInput;
                    break;
                }
                temp = temp.next;
            } while (temp != null);

        
    }
    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            int i = 0;
    
            // Traverse the list until the desired index or the end is reached
            while (temp != null && i < index - 1) {
                temp = temp.next;
                i++;
            }
    
            // Check if the index is out of bounds
            if (temp == null) {
                System.out.println("indeks melebihi panjang linked list");
            } else {
                temp.next = new Node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }
    
    public int getData (int index) {
        Node tmp = head;
        for (int i = 0; i < index; i ++){

        }
        return tmp.data;
    }

    public int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public void removeLast () {
        if (! isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else {
            Node temp = head; 
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break; // Move break inside the loop
                } else if (temp.next != null && temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break; // Move break inside the loop
                }
                temp = temp.next;
            }
        }
    }
    

    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        } else{
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            
        }
    }

    // Tugas no 1
    public void insertBefore(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            } else if (temp.next.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        }
    }
}
        
    


