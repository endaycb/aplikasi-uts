package com.muhardin.edy.belajar.aplikasi.uts;

import java.sql.*;


public class MahasiswaDao{
	private Connection koneksiDatabase;
	private String dbDriver = "com.mysql.jdbc.Driver";
	private String dbUrl = "jdbc:mysql://localhost/uts";
	private String dbUsername = "root";
	private String dbPassword = "root";

	public void MahasiswaDao(){
	
	}
	
	public void connect(){
		
		try {
			Class.forName(dbDriver);
			koneksiDatabase = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void disconnect(){
		try {
			if(koneksiDatabase != null){
				koneksiDatabase.close(); 
			}
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void simpan(Mahasiwa m){
		try {
			connect();
			
			String sql = "INSERT INTO mahasiswa (npm, nama, tempat_lahir, tanggal_lahir, jenis_kelamin, alamat) VALUES (?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = koneksiDatabase.prepareStatement(sql);
			ps.setString(1, m.getNpm());
			ps.setString(2, m.getNama());
			ps.setString(3, m.getTempatLahir());
			ps.setDate(4, new java.sql.Date(m.getTanggalLahir().getTime()));
			ps.setString(5, m.getJenisKelamin());
			ps.setString(6, m.getAlamat());
			
			ps.executeUpdate();
			
			disconnect();
		} catch (Exception ex){
			ex.printStackTrace();
		}
	
	
	}
	
}
