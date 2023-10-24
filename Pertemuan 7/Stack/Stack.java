 public class Stack {
        int size;
        int top;
        Buku data[];
    
        public Stack (int size){
            this.size = size;
            data = new Buku [size];
            top = -1;
        }
    
        public boolean isEmpty(){
            if(top == -1){
                return true;
            } else{
                return false;
            }
        }
    
        public boolean isFull(){
            if(top == size-1){
                return true;
            } else {
                return false;
            }
        }
    
        public void push(Buku bk){
            if(!isFull()){
                top++;
                data[top] = bk;
            } else {
                System.out.println("Isi stack penuh!");
            }
        }
    
        public void pop(){
            if(!isEmpty()){
                Buku x = data[top];
                top--;
                System.out.println("Data yang keluar:  " + x.judul + " " + x.namaPengarang + " " + x.tahunterbit + " " + x.jmlHalaman + " " + x.harga);
            } else{
                System.out.println("Stack masih kosong!");
            }
        }
    
        public void peek(){
            System.out.println("Elemen teratas: " + data[top].judul + " " + data[top].namaPengarang + "  " + data[top].tahunterbit + " " + data[top].jmlHalaman + " " + data[top].harga);
    
        }
    
        public void print(){
            System.out.println("Isi stack: ");
            for(int i = top; i >= 0; i--){
                System.out.print(data[i].judul +" " + data[i].namaPengarang + " " + data[i].tahunterbit + " " + data[i].jmlHalaman + " " + data[i].harga);
            } 
            System.out.println("");  
        }
    
        public void clear(){
            if(isEmpty()){
                for (int i = top; i >= 0; i--){
                    top--;
                }
                System.out.println("Stack sudah dikosongkan");
            } else {
                System.out.println("Gagal! Stack masih kosong");
            }
        }
    
        }

