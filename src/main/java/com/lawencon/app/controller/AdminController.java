package com.lawencon.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lawencon.app.model.CalonMahasiswa;
import com.lawencon.app.service.CalonMahasiswaService;

@RestController
@CrossOrigin("*")
public class AdminController extends BaseController<CalonMahasiswa> {
	@Autowired
	CalonMahasiswaService calonMahasiswaService;
	
	CalonMahasiswa calonMahasiswa = new CalonMahasiswa();
	List<CalonMahasiswa> listCalonMahasiswa = new ArrayList<>();
	
	@PutMapping("/accmahasiswa")
	public ResponseEntity<String> acc(@RequestBody String content) throws Exception {
		try {
			calonMahasiswa = super.readValue(content, CalonMahasiswa.class);
			return new ResponseEntity<>(calonMahasiswaService.accCalonMahasiswa(calonMahasiswa), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Gagal Terima Calon Mahasiswa",HttpStatus.BAD_GATEWAY);
		}
	}
	
	@PutMapping("/rejectmahasiswa")
	public ResponseEntity<String> reject(@RequestBody String content) throws Exception {
		try {
			calonMahasiswa = super.readValue(content, CalonMahasiswa.class);
			return new ResponseEntity<>(calonMahasiswaService.rejectCalonMahasiswa(calonMahasiswa), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Gagal Tolak Calon Mahasiswa",HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/mhsacc")
	public ResponseEntity<List<CalonMahasiswa>> getAcc(){
		try {
			listCalonMahasiswa = calonMahasiswaService.getCalonMahasiswaAcc();
			return new ResponseEntity<List<CalonMahasiswa>>(listCalonMahasiswa, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<CalonMahasiswa>>(listCalonMahasiswa, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/mhsreject")
	public ResponseEntity<List<CalonMahasiswa>> getReject(){
		try {
			listCalonMahasiswa = calonMahasiswaService.getCalonMahasiswaReject();
			return new ResponseEntity<List<CalonMahasiswa>>(listCalonMahasiswa, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<CalonMahasiswa>>(listCalonMahasiswa, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/mhspending")
	public ResponseEntity<List<CalonMahasiswa>> getPending(){
		try {
			listCalonMahasiswa = calonMahasiswaService.getCalonMahasiswaPending();
			return new ResponseEntity<List<CalonMahasiswa>>(listCalonMahasiswa, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<CalonMahasiswa>>(listCalonMahasiswa, HttpStatus.BAD_REQUEST);
		}
	}
}
