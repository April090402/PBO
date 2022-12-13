package id.ac.undiksha.www;

import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		Mahasiswa  mhs2 = new Mahasiswa(
				"Budi",
				"Denpasar",
				"2115101070",
				true,
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"	
		);
		
		Dosen dsn1 = new Dosen(
				"2389673",
				"Wisnu",
				true,
				"Singaraja",
				"PA",
				"Sistem Informasi",
				"Teknik Informatika",
				"FTK"
				);
		
		Pegawai pgw1 = new Pegawai(
				"23685419",
				"Mahendra",
				true,
				"Singaraja",
				"Satpan",
				"No Info"
				);
				
		mhs2.printAllinfo();
		System.out.println("\n");
		dsn1.printAllinfo();
		System.out.println("\n");
		pgw1.printAllinfo();
	}
}


