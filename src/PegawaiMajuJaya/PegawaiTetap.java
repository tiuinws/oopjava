package PegawaiMajuJaya;
/**
 ** class PegawaiTetap 
 **/
import alfianLib.fn;

class PegawaiTetap extends Pegawai implements GajiPegawai
{
    // fun fact, we dont need an interface btw;
    // no const attribute!!! although uangMakan is not constant
    private double tunjangan, totalGaji;

    private double getTunjangan() { return tunjangan; }

    public double getTotalGaji() { return totalGaji; }

    private void setTunjangan() { this.tunjangan = 500000; }

    public void setTotalGaji() { totalGaji = getUangMakan() + getTunjangan() + getGajiPokok(); }

    PegawaiTetap(String conNoPeg, String conNama, double conKehadiran, double conGajiPokok)
    {
	super(conNoPeg, conNama, conKehadiran, conGajiPokok);
	setTunjangan();
	setTotalGaji();
    }

    void lihatData()
    {
	fn.outln("Nama: " + getNama());
	fn.outln("NoPeg: " + getNoPeg());
	fn.outln("Kehadiran: " + getKehadiran() + " hari");
	fn.outln("UangMakan: Rp" + getUangMakan());
	fn.outln("GajiPokok: Rp" + getGajiPokok());
	fn.outln("Tunjangan: Rp" + getTunjangan());
	fn.outln("Total Gaji: Rp" + getTotalGaji());
    }
}
