package com.muhardin.edy.belajar.aplikasi.uts;

import java.util.Date;

public class Mahasiswa{
	private Integer id;
	private String npm;
	private String nama;
	private String tempatLahir;
	private Date tanggalLahir;
	//private JenisKelamin jenisKelamin;
	private String jenisKelamin;
	private String alamat;
	
	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getNpm(){
		return this.npm;
	}
	
	public void setNpm(String npm){
		this.npm = npm;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getTempatLahir(){
		return this.tempatLahir;
	}
	
	public void setTempatLahir(String tempatLahir){
		this.tempatLahir = tempatLahir;
	}
	
	public Date getTanggalLahir(){
		return this.tanggalLahir;
	}
	
	public void setTanggalLahir(Date tanggalLahir){
		this.tanggalLahir = tanggalLahir;
	}

	/*public JenisKelamin getJenisKelamin(){
		return this.jenisKelamin;
	}
	
	public void setJenisKelamin(JenisKelamin jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}*/
	
	public String getJenisKelamin(){
		return this.jenisKelamin;
	}
	
	public void setJenisKelamin(String jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}
	
	public String getAlamat(){
		return this.alamat;
	}
	
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
}

