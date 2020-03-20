package praktikum6;
import alfianLib.*;
public class praktikum6 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("1808096025", "Budiman", 170, true);
        fn.outln("Data Mahasiswa 1" + "\nNama: " + mhs1.getNama() + "\nNIM: " + mhs1.getNim() + "\nTinggi: " + mhs1.getTinggi() + "\n" + (!mhs1.isPindahan() ? "Mahasiswa Reguler" : "Mahasiswa Pindahan") + "\n");
        Mahasiswa mhs2 = new Mahasiswa("1808096024", "Budimanx", 165, false);
        fn.outln("Data Mahasiswa 2" + "\nNama: " + mhs2.getNama() + "\nNIM: " + mhs2.getNim() + "\nTinggi: " + mhs2.getTinggi() + "\n" + (!mhs2.isPindahan() ? "Mahasiswa Reguler" : "Mahasiswa Pindahan") + "\n");
        fn.outln(mo.decade(10));
    }
}

class Mahasiswa {
    private String nim, nama;
    private int tinggi;
    private boolean pindahan;

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getTinggi() { return tinggi; }
    public void setTinggi(int tinggi) { this.tinggi = tinggi; }
    public boolean isPindahan() { return pindahan; }
    public void setPindahan(boolean pindahan) { this.pindahan = pindahan; }

    Mahasiswa(String nim, String nama, int tinggi, boolean pindahan) {
        setNim(nim);
        setNama(nama);
        setTinggi(tinggi);
        setPindahan(pindahan);
    }

    Mahasiswa(String nim, String nama, int tinggi) {
        setNim(nim);
        setNama(nama);
        setTinggi(tinggi);
    }
}
