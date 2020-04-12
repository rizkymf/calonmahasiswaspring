package com.lawencon.app.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lawencon.app.model.CalonMahasiswa;
import com.lawencon.app.service.CalonMahasiswaService;

@RestController
@CrossOrigin("*")
public class CalonMahasiswaController extends BaseController<CalonMahasiswa> {

	@Autowired
	CalonMahasiswaService calonMahasiswaService;
	
	CalonMahasiswa calonMahasiswa = new CalonMahasiswa();
	List<CalonMahasiswa> listCalonMahasiswa = new ArrayList<>();
	
	@PostMapping("/calonmahasiswa")
	public ResponseEntity<String> insert(@RequestBody String content) throws Exception {
		try {
			calonMahasiswa = super.readValue(content, CalonMahasiswa.class);
			return new ResponseEntity<>(calonMahasiswaService.addCalonMahasiswa(calonMahasiswa), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Gagal Tambah Calon Mahasiswa",HttpStatus.BAD_GATEWAY);
		}
	}
	
	@PutMapping("/calonmahasiswa")
	public ResponseEntity<String> ubah(@RequestBody String content) throws Exception {
		try {
			calonMahasiswa = super.readValue(content, CalonMahasiswa.class);
			return new ResponseEntity<>(calonMahasiswaService.updateCalonMahasiswa(calonMahasiswa), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("Gagal Ubah Calon Mahasiswa",HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/calonmahasiswa")
	public ResponseEntity<List<CalonMahasiswa>> get(){
		try {
			listCalonMahasiswa = calonMahasiswaService.getCalonMahasiswa();
			return new ResponseEntity<List<CalonMahasiswa>>(listCalonMahasiswa, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<List<CalonMahasiswa>>(listCalonMahasiswa, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/calonmahasiswa/{id}")
	public ResponseEntity<String> hapus(@PathVariable("id") Integer id) throws Exception {
		try {
			return new ResponseEntity<>(calonMahasiswaService.deleteCalonMahasiswa(id), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("Gagal Hapus CalonMahasiswa",HttpStatus.BAD_GATEWAY);
		}
	}
}
