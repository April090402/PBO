package id.ac.undiksha.siak.entities;

public class Pegawai {
	private String nip;
	private String nama;
	private boolean jenisKelamin; //0 perempuan, 1 laki-laki
	private String alamat;
	private String jabatan;
	private String unit;
	
	public Pegawai(String nip, String nama, boolean jenisKelamin, String alamat, String jabatan,
			String unit) {
		super();
		this.nip = nip;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.alamat = alamat;
		this.jabatan = jabatan;
		this.unit = unit;	
	}
	public Pegawai() {
		this.setNip("<Nip belum diisi>");
		this.setNama("<Nama belum diisi>");
		this.setAlamat("<Alamat belum diisi>");
		this.setJabatan("<Jabatan belum diisi>");
		this.setUnit("<Unit belum diisi>");
	}
	public void printAllinfo() {
		System.out.println("NIP:" + this.getNip());
		System.out.println("Nama:" + this.getNama());
		System.out.println("Alamat:" + this.getAlamat());
		System.out.println("Jabatan:" + this.getJabatan());
		System.out.println("Unit:" + this.getUnit());
		System.out.println("Jenis Kelamin:  " +
				 (jenisKelamin ? "Laki-laki" : "Perempuan"));
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public boolean isJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
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
