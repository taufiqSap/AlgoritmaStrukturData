public class Tugas1 {
    public double arr[];
    int x[] = ;
    public Tugas1(double arrNilai[]) {
        arr = new double[arrNilai.length];
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public int cari(double keyword) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (keyword == arr[i]) {
                index = i;
                break;
            } else {
                if (keyword < arr[i]) {
                    break;
                }
            }
        }
        return index;
    }

}