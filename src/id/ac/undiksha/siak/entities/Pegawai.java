package id.ac.undiksha.siak.entities;

public class Pegawai extends Manusia{
	private String 	nip;
	private String 	jabatan;
	private String 	unit;
	
	public Pegawai(String nip, String nama, boolean jenisKelamin, String alamat, String jabatan, String unit) {
		super();
		this.nip = nip;
		this.jabatan = jabatan;
		this.unit = unit;
	}
	
	public Pegawai(String nama, String alamat, boolean jenisKelamin) {
		super(nama, alamat, jenisKelamin);
		// TODO Auto-generated constructor stub
	}

	public Pegawai() { //construktor untuk set default value
		super();
		this.setNip("<NIP belum diisi>");
		this.setJabatan("<Jabatan belum diisi>");
		this.setUnit("<Unit belum diisi>");
	}
	
	public void printAllInfo() { //untuk printout semua data bersamaan
		System.out.println("NIP: " + this.getNip());
		System.out.println("Nama: " + this.getNama());
		System.out.println("Jenis Kelamin: " + 
				(isJenisKelamin() ? "Laki-laki" : "Perempuan")); //kondisi if True/False = ? True : Else
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("Jabatan: " + this.getJabatan());
		System.out.println("Unit: " + this.getUnit());
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
	