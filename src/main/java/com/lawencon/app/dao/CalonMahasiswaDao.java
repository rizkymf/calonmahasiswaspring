package com.lawencon.app.dao;

import java.util.List;

import com.lawencon.app.model.CalonMahasiswa;

public interface CalonMahasiswaDao {
	abstract void addCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception;
	abstract List<CalonMahasiswa> getCalonMahasiswa() throws Exception;
	abstract void updateCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception;
	abstract void deleteCalonMahasiswa(Integer id) throws Exception;
	abstract List<CalonMahasiswa> getCalonMahasiswaAcc() throws Exception;
	abstract List<CalonMahasiswa> getCalonMahasiswaReject() throws Exception;
	abstract List<CalonMahasiswa> getCalonMahasiswaPending() throws Exception;

}
