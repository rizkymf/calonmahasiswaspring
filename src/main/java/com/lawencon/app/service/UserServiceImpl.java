package com.lawencon.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lawencon.app.dao.UserDao;
import com.lawencon.app.model.Users;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public String addUsers(Users users) throws Exception {
		userDao.addUser(users);
		return "Berhasil Tambah Pengguna";
	}

	@Override
	public List<Users> getUsers() throws Exception {
		return userDao.getUsers();
	}

	@Override
	public String updateUsers(Users users) throws Exception {
		userDao.updateUsers(users);
		return "Berhasil Ubah Pengguna";
	}

	@Override
	public String deleteUsers(Integer id) throws Exception {
		userDao.deleteUsers(id);
		return "Berhasil Hapus Pengguna";
	}

	@Override
	public Users cekUser(Users user) throws Exception {
		return userDao.cekUser(user);
	}
	
	
	
}
