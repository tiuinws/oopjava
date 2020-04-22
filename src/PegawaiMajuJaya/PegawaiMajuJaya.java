package PegawaiMajuJaya;
/**
 ** class PegawaiKontrak
 ** UTS OOP CLASS UIN WALISONGO SEMARANG
 ** Copyright Alfian Hidayat(1808096025)
 **/

import alfianLib.fn;
import java.util.*;
    
class PegawaiMajuJaya {
    public static void main(String[] args) {
	int exit;
	Scanner s = new Scanner(System.in);
	fn.outln("Program Pegawai Maju Jaya");
	List<PegawaiTetap> listPt = new ArrayList<PegawaiTetap>(); // [] -> [{objek baru},{},{}]
	List<PegawaiKontrak> listPk = new ArrayList<PegawaiKontrak>();
	exit = 0;
	do {
		try {
			int menu;
			fn.outln("\nSilahkan dipilih menunya");
			fn.outln("1. Input Data Pegawai");
			fn.outln("2. Lihat Data Pegawai");
			fn.outln("3. Keluar");
			fn.out("kamu memasukkan : "); menu = s.nextInt();
			switch (menu) {
			case 1:
			    String inputNoPeg, inputNama;
			    int inputPegawai, inputKehadiran;
			    double inputGajiPokok;
			    fn.out("\nPegawai Tetap atau Pegawai Kontrak? [1/2] = "); inputPegawai = s.nextInt();
			    switch (inputPegawai) {
			    case 1:
				fn.out("Masukkan Nomor Pegawai = "); inputNoPeg = s.next();
				fn.out("Masukkan Nama Pegawai = "); inputNama = s.next();
				fn.out("Masukkan Kehadiran Pegawai = "); inputKehadiran = s.nextInt();
				fn.out("Masukkan Gaji Pegawai = "); inputGajiPokok = s.nextDouble();
				PegawaiTetap newPt = new PegawaiTetap(inputNoPeg, inputNama, inputKehadiran, inputGajiPokok);
				listPt.add(newPt);
				fn.outln("\nSUCCESS : Pegawai Tetap " + inputNama + " sukses ditambahkan.");
				break;
			    case 2:
				fn.out("Masukkan Nomor Pegawai = "); inputNoPeg = s.next();
				fn.out("Masukkan Nama Pegawai = "); inputNama = s.next();
				fn.out("Masukkan Kehadiran Pegawai = "); inputKehadiran = s.nextInt();
				fn.out("Masukkan Gaji Pegawai = "); inputGajiPokok = s.nextDouble();
				fn.out("Masukkan Masa Kontrak = "); int inputMasaKontrak = s.nextInt();
				PegawaiKontrak newPk = new PegawaiKontrak(inputNoPeg, inputNama, inputKehadiran, inputGajiPokok, inputMasaKontrak);
				listPk.add(newPk);
				fn.outln("\nSUCCESS : Pegawai Kontrak " + inputNama + " sukses ditambahkan.");
				break;
			    default:
				fn.outln("Masukkan pilihan yang benar [1,2]");
				break;
			    }
			    menu = 2;
			    break;
			case 2:
			    fn.outln("\n/** List Pegawai Tetap **/");
			    if (listPt.isEmpty()) {
				    fn.outln("\nOOOPS : Pegawai tetap kosong");
			    } else {
				for (PegawaiTetap pt : listPt) {
					fn.outln();
					pt.lihatData();
					fn.outln("++--------------------++");
				}
			    }
			    fn.outln("\n/** List Pegawai Kontrak **/");
			    if (listPk.isEmpty()) {
				fn.outln("\nOOOPS : Pegawai kontrak kosong");
			    } else {
				for (PegawaiKontrak pk : listPk)
				    {
					fn.outln();
					pk.lihatData();
					fn.outln("++--------------------++");
				    }
			    }
			    break;
			case 3:
			    fn.outln("Terimakasih, sampai jumpa lagi!!!");
			    exit = 1;
			    break;
			default:
			    fn.outln("Masukkan pilihan yang benar [1,2,3]");
			    exit = 0;
			    break;
			}
		} catch (InputMismatchException e) {
			System.out.println("\nMasukkan inputan yang benar!!!!!, error = " + e);
			s.nextLine();
		}
	} while(exit==0);
	s.close();
    }
}
