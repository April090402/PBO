package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Manusia;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		
//		Mahasiswa mhs1 = new Mahasiswa(
//				"2115101070",
//				"April",
//				true,
//				"Singaraja",
//				"Ilmu Komputer",
//				"Teknik Informatika",
//				"FTK"
//				);

		System.out.println("Data Mahasiswa");
		
//		mhs1.printAllInfo();
//		
//		Mahasiswa mhs2 = new Mahasiswa(
//				"2115101088",
//				"Budi",
//				true,
//				"Denpasar",
//				"Ilmu Komputer",
//				"Teknik Informatika",
//				"FTK"
//				);
//		System.out.println("");
//		
//		mhs2.printAllInfo();
		
		System.out.println("");
//		System.out.println("Data Dosen");

		Manusia mns1 = new Manusia();
		mns1.setNama("Dodi");
		mns1.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs3");
		Mahasiswa mhs3 = new Mahasiswa();
		mhs3.setNama("Dodi");
		mhs3.setProdi("Ilmu Komputer");
		mhs3.printAllInfo();
		
//		Manusia mns2 = new Manusia("Adi", true "Singaraja");
//		mns2.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs5");
		Mahasiswa mhs5 = new Mahasiswa("1234","ILKOM", "TI", "FTK");	
//		mhs5.getAlamat();
//		mhs5.getNim();
		mhs5.printAllInfo();
		
		System.out.println("");
		System.out.println("mhs7");
		Mahasiswa mhs7 = new Mahasiswa("Anton","Denpasar", true);
		mhs7.printAllInfo();
		
		System.out.println("");
		System.out.println("siX");
		Manusia siX = new Mahasiswa (); //sesuai tipe : Manusia , Mahasiswa adalah manusia, jadi Mahasiswa bisa buat manusia dan juga mahasiswa
		siX.getNama();
//		siX.getNim();
		siX.printAllInfo();
		
//		Mahasiswa siY = new Manusia();Error karena Manusia bukan mahasiswa, jadi hanya bisa buat manusia saja.
		
	
		
//		System.out.println("");
//		System.out.println("Data Pegawai");
//		pgw1.printAllInfo();
		
		System.out.println("");
		System.out.println("dosen");
		Dosen dos = new Dosen("Dosen1","Singaraja",true);
		dos.setNip("123");
		dos.setJabatan("Dosen Biasa");
		dos.setProdi("ILKOM"); 
		dos.setJurusan("TI");
		dos.setFakultas("FTK");
		dos.printAllInfo();
		
		System.out.println("");
		System.out.println("Pegawai");
		Manusia A = new Pegawai ("Abcd", "Badung", true); //dibuat oleh pegawai namun hanya data manusia
		A.printAllInfo();
		
		System.out.println("");
		System.out.println("Pegawai 1");
		Pegawai pgw1 = new Pegawai("Pegawai1", "Jakarta", false); //data manusia
		pgw1.setNip("1111"); //set data pegawai
		pgw1.setJabatan("Karyawan Tetap");
		pgw1.setUnit("Sektor A");
		pgw1.printAllInfo();
	}
}
