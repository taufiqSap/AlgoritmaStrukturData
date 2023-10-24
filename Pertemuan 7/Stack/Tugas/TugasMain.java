package Tugas;
  import java.util.Scanner;
public class TugasMain {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String klm = sc.nextLine();
        Reverse tgs1 = new Reverse(klm);
        String rs = tgs1.reverseString();
        
        System.out.println("Hasil :");
        System.out.println(rs);

        sc.close();
    }
}
