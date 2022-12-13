package id.ac.undiksha.siak.entities;

public class Mahasiswa {

	private String nama;
	private String alamat;
	private String nim;
	private boolean jenisKelamin; //0 perempuan, 1 laki-laki
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	
	
	public Mahasiswa(String nama, String alamat, String nim, boolean jenisKelamin, String prodi, String jurusan,
			String fakultas) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.nim = nim;
		this.jenisKelamin = jenisKelamin;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public Mahasiswa() {
		this.setNama("nama belom diisi");
		this.setAlamat("Alamat belum diisi");
		this.setNim("Nim belum diisi");
		this.setProdi("prodi belum diisi");
		this.setJurusan("jurusan belum diisi");
		this.setFakultas("fakultas belum diisi");
	}
	
	public void printAllinfo() {
		System.out.println("Nama:" + this.getNama());
		System.out.println("Alamat:" + this.getAlamat());
		System.out.println("NIM:" + this.getNim());
		System.out.println("Prodi:" + this.getProdi());
		System.out.println("Jurusan:" + this.getJurusan());
		System.out.println("Fakultas:" + this.getFakultas());
		
		System.out.println("Jenis Kelamin:  " +
				 (jenisKelamin ? "Laki-laki" : "Perempuan"));
	}
	public String getNama() {
		return this.nama;
	} 
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public boolean isJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
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
	public void setNama(String nama) {
		this.nama = nama;
	}
}
