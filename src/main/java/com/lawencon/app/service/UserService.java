package com.lawencon.app.service;

import java.util.List;

import com.lawencon.app.model.Users;

public interface UserService {
	abstract String addUsers(Users users) throws Exception;
	abstract List<Users> getUsers() throws Exception;
	abstract String updateUsers(Users users) throws Exception;
	abstract String deleteUsers(Integer id) throws Exception;
	abstract Users cekUser(Users user) throws Exception;
}
