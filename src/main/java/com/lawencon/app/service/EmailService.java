package com.lawencon.app.service;

import com.lawencon.app.model.CalonMahasiswa;

public interface EmailService {

	abstract void sendEmail(CalonMahasiswa calonMahasiswa) throws Exception;
	abstract void sendAcc(CalonMahasiswa calonMahasiswa) throws Exception;
	abstract void sendReject(CalonMahasiswa calonMahasiswa) throws Exception;
}
