public class Nasabah {

    public int id, noHP, noRek, saldo;
    public String alamat = ""; // biar bisa diisi
    public String nama = "";   // biar bisa diisi
    public float jmlhHutang;
    public boolean statusAktif;

    public Nasabah(int id, String nama, String alamat, int noHP) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
    }

    public int lihatSaldo() {
        if (statusAktif) {
            return saldo;
        } else {
            return -1;
        }
    }

    public int menabung(int deposit) {
        if (statusAktif) {
            if (deposit > 0) {
                saldo += deposit;
                return saldo;
            } else {
                return -1;
            }

        } else {
            return -1;
        }
    }

    public int tarikTunai(int jmlhTarik) {
        if (statusAktif) {
            if (jmlhTarik > 0 && jmlhTarik <= saldo) {
                saldo -= jmlhTarik;
                return saldo;
            } else {
                return -1; // jumlah tarik saldo
            }
        } else {
            return -1; // rekening tidak aktif
        }
    }

    public void bukaRekening() {
        if (!statusAktif) {
            noRek = nomerRekening();
            statusAktif = true;

        } else {
            System.out.println("AKUN ANDA SUDAH AKTIF");
        }
    }

    public void tutupRekening() {
        if (statusAktif) {
            noRek = 0;
            saldo = 0;
            jmlhHutang = 0;
            statusAktif = false;
        }
    }

    public void berhutang(int jmlhHutang) {
        if (statusAktif) {
            if (jmlhHutang <= saldo) {
                this.jmlhHutang += (float) jmlhHutang;
            } else {
                System.out.println("Permintaan ditolak");

            }
        }
    }



    public int cicilan() {
        return (int) (jmlhHutang / 6);
    }

    public void bayarCicilan(float cicilan) {
        jmlhHutang =- cicilan;
    }

    public int nomerRekening() {
        return id = 1000;
    }

    public String getNama() {
        return nama;
    }

}
