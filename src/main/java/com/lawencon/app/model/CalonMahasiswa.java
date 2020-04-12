package com.lawencon.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CalonMahasiswa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCalonMhs;
		
	//calon mhs
	@Column(unique = true)
	private String ktpMhs;
	private String namaMhs, jenisKelaminMhs, emailMhs, ttlMhs, alamatMhs;
	
	//ortu
	@Column(unique = true)
	private  String ktpAyah;
	private String namaAyah, hpAyah, pekerjaanAyah;
	
	private String jurusan;
	
	//sekolah
	private String asalSekolah, jurusanSekolah, alamatSekolah;
	
	//nilai
	private long nilaiMtk, nilaiInggris, nilaiIndonesia, nilaiIPA;
	
	private String status;

	public Integer getIdCalonMhs() {
		return idCalonMhs;
	}

	public void setIdCalonMhs(Integer idCalonMhs) {
		this.idCalonMhs = idCalonMhs;
	}

	public String getNamaMhs() {
		return namaMhs;
	}

	public void setNamaMhs(String namaMhs) {
		this.namaMhs = namaMhs;
	}

	public String getJenisKelaminMhs() {
		return jenisKelaminMhs;
	}

	public void setJenisKelaminMhs(String jenisKelaminMhs) {
		this.jenisKelaminMhs = jenisKelaminMhs;
	}

	public String getEmailMhs() {
		return emailMhs;
	}

	public void setEmailMhs(String emailMhs) {
		this.emailMhs = emailMhs;
	}

	public String getTtlMhs() {
		return ttlMhs;
	}

	public void setTtlMhs(String ttlMhs) {
		this.ttlMhs = ttlMhs;
	}

	public String getAlamatMhs() {
		return alamatMhs;
	}

	public void setAlamatMhs(String alamatMhs) {
		this.alamatMhs = alamatMhs;
	}

	public String getKtpMhs() {
		return ktpMhs;
	}

	public void setKtpMhs(String ktpMhs) {
		this.ktpMhs = ktpMhs;
	}

	public String getKtpAyah() {
		return ktpAyah;
	}

	public void setKtpAyah(String ktpAyah) {
		this.ktpAyah = ktpAyah;
	}

	public String getNamaAyah() {
		return namaAyah;
	}

	public void setNamaAyah(String namaAyah) {
		this.namaAyah = namaAyah;
	}

	public String getHpAyah() {
		return hpAyah;
	}

	public void setHpAyah(String hpAyah) {
		this.hpAyah = hpAyah;
	}

	public String getPekerjaanAyah() {
		return pekerjaanAyah;
	}

	public void setPekerjaanAyah(String pekerjaanAyah) {
		this.pekerjaanAyah = pekerjaanAyah;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public String getAsalSekolah() {
		return asalSekolah;
	}

	public void setAsalSekolah(String asalSekolah) {
		this.asalSekolah = asalSekolah;
	}

	public String getJurusanSekolah() {
		return jurusanSekolah;
	}

	public void setJurusanSekolah(String jurusanSekolah) {
		this.jurusanSekolah = jurusanSekolah;
	}

	public String getAlamatSekolah() {
		return alamatSekolah;
	}

	public void setAlamatSekolah(String alamatSekolah) {
		this.alamatSekolah = alamatSekolah;
	}

	public long getNilaiMtk() {
		return nilaiMtk;
	}

	public void setNilaiMtk(long nilaiMtk) {
		this.nilaiMtk = nilaiMtk;
	}

	public long getNilaiInggris() {
		return nilaiInggris;
	}

	public void setNilaiInggris(long nilaiInggris) {
		this.nilaiInggris = nilaiInggris;
	}

	public long getNilaiIndonesia() {
		return nilaiIndonesia;
	}

	public void setNilaiIndonesia(long nilaiIndonesia) {
		this.nilaiIndonesia = nilaiIndonesia;
	}

	public long getNilaiIPA() {
		return nilaiIPA;
	}

	public void setNilaiIPA(long nilaiIPA) {
		this.nilaiIPA = nilaiIPA;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
