public class SortMain {  
    public static void main(String[] args) {
    int a[] = {15, 10, 7, 22, 5};
    Sort urut = new Sort(a, a.length);
    System.out.println("Data Sebelum Urut: ");
    urut.tampilData();
    System.out.println("Data Sesudah Urut Bubble Sort(ASC): ");
    urut.bubbleSort();
    urut.tampilData();
    System.out.println("Data Sesudah Urut Selection Sort(ASC): ");
    urut.selectionSort();
    urut.tampilData();
}

}