package com.lawencon.app.service;

import java.util.List;

import com.lawencon.app.model.CalonMahasiswa;

public interface CalonMahasiswaService {
	abstract String addCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception;
	abstract List<CalonMahasiswa> getCalonMahasiswa() throws Exception;
	abstract String updateCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception;
	abstract String deleteCalonMahasiswa(Integer id) throws Exception;
	abstract String accCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception;
	abstract String rejectCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception;
	abstract List<CalonMahasiswa> getCalonMahasiswaAcc() throws Exception;
	abstract List<CalonMahasiswa> getCalonMahasiswaReject() throws Exception;
	abstract List<CalonMahasiswa> getCalonMahasiswaPending() throws Exception;

}
