import java.util .Scanner;
public class PencarianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan elemen array : ");
        int jumlahElemen = sc.nextInt();

        double[] data = new double[jumlahElemen];
        for (int i=0 ;i< jumlahElemen;++i){
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            data[i] = sc.nextDouble();
            OrderedSearch os = new OrderedSearch(data);
            System.out.println("Isi elemen array: ");
            os.tampilkan();
            
            System.out.print("Masukkan data yang ingin dicari: ");
            double key = sc.nextDouble();
            
            int index = os.cari(key);
            if (index != -1) {
                System.out.println("Data " + key + " ditemukan pada index " + index);
            } else {
                System.out.println("Data " + key + " tidak ditemukan");
      









        //ouble[] data ={2.7,2.9,3.04,3.12,3.54,3.87,3.9};
       // OrderedSearch os = new OrderedSearch(data);
        //System.out.println("Isi elemen array: ");
        //int data = sc.nextInt();
        //double key=3.12;
        //int index= os.cari(key);
        //if (index!=1){
            //System.out.println("Data "+ key+ " pada index "+ index);
        //}else{
           // System.out.println("Data "+ key+" tidak ditemukan")
        }
        }
    }
}
    


