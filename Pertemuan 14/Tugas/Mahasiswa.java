

public class Mahasiswa {
    public String nim;
    public String  namaLengkap;
    public String jurusan;
    public String  programStudi;

    public Mahasiswa(String nim, String namaLengkap, String jurusan, String programStudi) {
        this.nim = nim;
        this.namaLengkap = namaLengkap;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getProgramStudi() {
        return programStudi;
    }
}


