package PegawaiMajuJaya;
/**
 ** class PegawaiKontrak
 ** UTS OOP CLASS UIN WALISONGO SEMARANG
 ** Copyright Alfian Hidayat(1808096025)
 **/

import alfianLib.fn;

class PegawaiKontrak extends Pegawai
{
    int masaKontrak;
    double totalGaji;

    int getMasaKontrak() { return masaKontrak; }

    public double getTotalGaji() { return totalGaji; }

    void setMasaKontrak(int paramMasaKontrak) { this.masaKontrak = paramMasaKontrak; }

    public void setTotalGaji() { totalGaji = getUangMakan() + getGajiPokok(); }

    PegawaiKontrak(String conNoPeg, String conNama, double conKehadiran, double conGajiPokok, int conMasaKontrak)
    {
	super(conNoPeg, conNama, conKehadiran, conGajiPokok);
	setMasaKontrak(conMasaKontrak);
	setTotalGaji();
    }

    void lihatData()
    {
	fn.outln("Nama: " + getNama());
	fn.outln("NoPeg: " + getNoPeg());
	fn.outln("Kehadiran: " + getKehadiran() + " hari");
	fn.outln("UangMakan: Rp" + getUangMakan());
	fn.outln("GajiPokok: Rp" + getGajiPokok());
	fn.outln("Total Gaji: Rp" + getTotalGaji());
	fn.outln("Masa Kontrak: " + getMasaKontrak() + " bulan");
    }

}
