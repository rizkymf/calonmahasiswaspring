package com.lawencon.app.dao;

import java.util.List;
import com.lawencon.app.model.Users;

public interface UserDao {
	abstract void addUser(Users users) throws Exception;
	abstract List<Users> getUsers() throws Exception;
	abstract void updateUsers(Users users) throws Exception;
	abstract void deleteUsers(Integer id) throws Exception;
	abstract Users cekUser(Users user) throws Exception;
}
