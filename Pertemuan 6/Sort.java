public class Sort {
    public int[] data;
    public int jumData;

    public Sort(int input[], int jmldata) {
        jumData = jmldata;
        data = new int[jmldata];
        for (int i = 0; i < jmldata; i++) {
            data[i] = input[i];
        }

    }

    void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < (jumData - i); j++) {
                if (data[j - 1] < data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    public void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void selectionSort() {
        for (int i = 0; i < jumData - 1; i++) {
            int max = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] > data[max]) {
                    max = j;
                }
            }
            int temp = data[i];
            data[i] = data[max];
            data[max] = temp;
        }
    }
}
