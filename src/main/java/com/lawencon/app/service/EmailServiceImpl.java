package com.lawencon.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import com.lawencon.app.model.CalonMahasiswa;
@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	JavaMailSender javaMailSender;
	
	@Override
	public void sendEmail(CalonMahasiswa calonMahasiswa) throws Exception {
		SimpleMailMessage pesan = new SimpleMailMessage();
		pesan.setTo(calonMahasiswa.getEmailMhs());
		pesan.setSubject("Penerimaan Calon Mahasiswa UNPAS");
		pesan.setText("Terimakasih sudah mendaftar, mohon tunggu informasi berikutnya");
		javaMailSender.send(pesan);
	}

	@Override
	public void sendAcc(CalonMahasiswa calonMahasiswa) throws Exception {
		SimpleMailMessage pesan = new SimpleMailMessage();
		pesan.setTo(calonMahasiswa.getEmailMhs());
		pesan.setSubject("Penerimaan Calon Mahasiswa UNPAS");
		pesan.setText("Selamat anda berhasil di terima sebagai mahasiswa Universitas Pasundan");
		javaMailSender.send(pesan);
	}

	@Override
	public void sendReject(CalonMahasiswa calonMahasiswa) throws Exception {
		SimpleMailMessage pesan = new SimpleMailMessage();
		pesan.setTo(calonMahasiswa.getEmailMhs());
		pesan.setSubject("Penerimaan Calon Mahasiswa UNPAS");
		pesan.setText("Mohon maaf anda gagal diterima sebagai mahasiswa Universitas Pasundan");
		javaMailSender.send(pesan);
	}

}
