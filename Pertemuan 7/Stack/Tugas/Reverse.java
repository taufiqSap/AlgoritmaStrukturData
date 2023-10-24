public class Reverse {
    String kalimat;

    public Reverse(String kalimat) {
        this.kalimat = kalimat;
    }

    public String reverseString() {
        Stack rs = new Stack(30);

        for (char c : kalimat.toCharArray()) {
            rs.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!rs.IsEmpty()) {
            sb.append(rs.pop());
        }
        return sb.toString();
    }
}
