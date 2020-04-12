package com.lawencon.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lawencon.app.dao.CalonMahasiswaDao;
import com.lawencon.app.model.CalonMahasiswa;

@Service
@Transactional
public class CalonMahasiswaServiceImpl implements CalonMahasiswaService {

	@Autowired
	CalonMahasiswaDao calonMahasiswaDao;
	
	@Autowired
	EmailService emailService;
	
	@Override
	public String addCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception {
		calonMahasiswa.setStatus("PENDING");
		calonMahasiswaDao.addCalonMahasiswa(calonMahasiswa);
		emailService.sendEmail(calonMahasiswa);
		return "Berhasil Tambah Calon Mahasiswa";
	}

	@Override
	public List<CalonMahasiswa> getCalonMahasiswa() throws Exception {
		return calonMahasiswaDao.getCalonMahasiswa();
	}

	@Override
	public String updateCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception {
		calonMahasiswaDao.updateCalonMahasiswa(calonMahasiswa);
		return "Berhasil Ubah Calon Mahasiswa";
	}

	@Override
	public String deleteCalonMahasiswa(Integer id) throws Exception {
		calonMahasiswaDao.deleteCalonMahasiswa(id);
		return "Berhasil Delete Calon Mahasiswa";
	}

	@Override
	public String accCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception {
		calonMahasiswa.setStatus("TERIMA");
		calonMahasiswaDao.updateCalonMahasiswa(calonMahasiswa);
		emailService.sendAcc(calonMahasiswa);
		return "Berhasil Terima Mahasiswa";
	}

	@Override
	public String rejectCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception {
		calonMahasiswa.setStatus("TOLAK");
		calonMahasiswaDao.updateCalonMahasiswa(calonMahasiswa);
		emailService.sendReject(calonMahasiswa);
		return "Berhasil Tolak Mahasiswa";
	}

	@Override
	public List<CalonMahasiswa> getCalonMahasiswaAcc() throws Exception {
		return calonMahasiswaDao.getCalonMahasiswaAcc();
	}

	@Override
	public List<CalonMahasiswa> getCalonMahasiswaReject() throws Exception {
		return calonMahasiswaDao.getCalonMahasiswaReject();
	}

	@Override
	public List<CalonMahasiswa> getCalonMahasiswaPending() throws Exception {
		return calonMahasiswaDao.getCalonMahasiswaPending();
	}

}
