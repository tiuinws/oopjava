package PegawaiMajuJaya;
/**
 ** class Pegawai
 ** UTS OOP CLASS UIN WALISONGO SEMARANG
 ** Copyright Alfian Hidayat(1808096025)
 **/

class Pegawai
{
    /* Attributes */
    private String noPeg, nama; // Worker ID and Name
    private double kehadiran, uangMakan, gajiPokok; // Attendance, Salary

    // getter & setter

    /* Getter */
    String getNoPeg() { return noPeg; }
    String getNama() { return nama; }
    int getKehadiran() { return (int)Math.round(kehadiran); }
    double getUangMakan() { return uangMakan; }
    double getGajiPokok() { return gajiPokok; }

    /* Setter */
    void setNoPeg(String paramNoPeg) { this.noPeg = paramNoPeg; }
    void setNama(String paramNama) { this.nama = paramNama; }
    void setKehadiran(double paramKehadiran) { this.kehadiran = paramKehadiran; }
    void setUangMakan() { this.uangMakan = 25000*getKehadiran(); }
    void setGajiPokok(double paramGajiPokok) { this.gajiPokok = paramGajiPokok; }

    Pegawai(String conNoPeg, String conNama, double conKehadiran, double conGajiPokok)
    {
	setNoPeg(conNoPeg); setNama(conNama); setKehadiran(conKehadiran); setUangMakan(); setGajiPokok(conGajiPokok);
    }
}
