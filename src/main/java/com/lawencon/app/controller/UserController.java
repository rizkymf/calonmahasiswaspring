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
import com.lawencon.app.model.Users;
import com.lawencon.app.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController extends BaseController<Users>{

	@Autowired
	UserService userService;
	
	Users user = new Users();
	List<Users> listUser = new ArrayList<>();
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody String content) throws Exception{
		try {
			user = super.readValue(content, Users.class);
			return new ResponseEntity<String>(userService.addUsers(user), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Gagal Tambah Pengguna", HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<Users>> getUser(){
		try {
			listUser = userService.getUsers();
			return new ResponseEntity<List<Users>>(listUser, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Users>>(listUser, HttpStatus.BAD_REQUEST);
		}
	} 
	
	@PutMapping("/user")
	public ResponseEntity<String> updateUser(@RequestBody String content){
		try {
			user = super.readValue(content, Users.class);
			return new ResponseEntity<String>(userService.updateUsers(user), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Gagal Update Pengguna", HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){
		try {
			return new ResponseEntity<String>(userService.deleteUsers(id), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Gagal Hapus Pengguna", HttpStatus.BAD_REQUEST);
		}	
	}
	
	@PostMapping("/login")
	public ResponseEntity<Users> cekUser(@RequestBody String content){
		try {
			user = super.readValue(content, Users.class);
			return new ResponseEntity<Users>(userService.cekUser(user), HttpStatus.OK);
//			return new ResponseEntity<Users>(userService.cekUser(user), HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Users>(user, HttpStatus.BAD_REQUEST);
		}
	} 
	 
}
