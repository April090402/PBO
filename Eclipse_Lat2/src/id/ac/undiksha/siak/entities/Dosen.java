package id.ac.undiksha.siak.entities;

public class Dosen extends Manusia{
	private String 	nip;
	private String 	jabatan;
	private String 	prodi;
	private String 	jurusan;
	private String 	fakultas;
	
	public Dosen(String nip, String nama, boolean jenisKelamin, String alamat, String jabatan, String prodi,
			String jurusan, String fakultas) {
		super();
		this.nip = nip;
		this.jabatan = jabatan;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}
	
	public Dosen() { //construktor untuk set default value
		super();
		this.setNip("<NIP belum diisi>");
		this.setJabatan("<Jabatan belum diisi>");
		this.setProdi("<Prodi belum diisi>");
		this.setJurusan("<Jurusan belum diisi>");
		this.setFakultas("<Fakultas belum diisi>");
	}
	
	public Dosen(String nama, String alamat, boolean jenisKelamin) {
		super(nama, alamat, jenisKelamin);
		// TODO Auto-generated constructor stub
	}
	

	public void printAllInfo() { //untuk printout semua data bersamaan baik dari dosen maupun manusia
		System.out.println("Nama: " + this.getNama());
		System.out.println("Jenis Kelamin: " + 
				(isJenisKelamin() ? "Laki-laki" : "Perempuan")); //kondisi if True/False = ? True : Else
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("NIP: " + this.getNip());
		System.out.println("Jabatan: " + this.getJabatan());
		System.out.println("Prodi: " + this.getProdi());
		System.out.println("Jurusan: " + this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
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

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public String getFakultas() {
		return fakultas;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
}
	
	