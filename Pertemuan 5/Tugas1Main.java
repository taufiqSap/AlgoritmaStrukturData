import java.util.Scanner;
public class Tugas1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input Element: ");
        int elemen = sc.nextInt();

        double [] data = {17,20,26,33,37,41,53,65,73,83};
        for(int i = 0; i < data.length; i++){
            System.out.print("input elemnt array of- "+ (i +1)+ " : ");
            data[i] = sc.nextDouble();
            Tugas1 tgs = new Tugas1(data);
            System.out.println("fill array elemnt: ");
            data[i] = sc.nextDouble();

        

        }
        }
        

    }
    

