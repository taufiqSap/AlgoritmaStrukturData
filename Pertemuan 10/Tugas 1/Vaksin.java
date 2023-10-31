class Vaksin {
    String nama;
    int antrian;
    Vaksin prev;
    Vaksin next;

    public Vaksin(String nama, int antrian) {
        this.antrian = antrian;
        this.nama = nama;
        this.prev = null;
        this.next = null;
    }
}
