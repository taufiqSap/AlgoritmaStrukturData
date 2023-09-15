public class Kandidat {
    
    public int elemen;
    public String name[];

    public Kandidat(int element) {
        elemen = element;
        name = new String[elemen];
    }
    public String totalDC(String[] name, int left, int right) {
        int mid;
        String hasil = "";
        if (left == right) {
            hasil = name[left];
        } else {
            mid = (left + right) / 2;
            String hasil1 = totalDC(name, left, mid);
            String hasil2 = totalDC(name, mid + 1, right);
            hasil = hasil1 + " " + hasil2;
        }
        return hasil;
    }
    public String getWinner() {
        String winner = "";
        int max = 0;
        for (int i = 0; i < elemen; i++) {
            int count = 0;
            for (int j = 0; j < elemen; j++) {
                if (name[i].equals(name[j])) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                winner = name[i];
            }
        }
        return winner;
    }
}

