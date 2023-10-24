package Tugas;

public class Stack {

    int size;
    int top;
    char data[];

    public Stack(int size){
        this.size = size;
        data = new char[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull() {
        if(top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(char dt) {
        if(!IsFull()){
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public char pop(){
        if(!IsEmpty()){
            char x = data[top];
            top--;
            return x;
        } else {
            System.out.println("Stack masih kosong");
            return 0;
        }
    }

    public void peek() {
        System.out.println("Elemen teratas: " + data[top]);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    public void clear(){
        if(!IsEmpty()) {
            for (int i = top; i >= 0; i++) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}


