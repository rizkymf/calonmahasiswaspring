package com.lawencon.app.dao;

import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.lawencon.app.model.Users;

@Repository
public class UserDaoImpl extends BaseHibernate implements UserDao  {

	@Override
	public void addUser(Users users) throws Exception {
		em.persist(users);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getUsers() throws Exception {
		Query q = em.createQuery("from Users");
		return q.getResultList();
	}

	@Override
	public void updateUsers(Users users) throws Exception {
		em.merge(users);
	}

	@Override
	public void deleteUsers(Integer id) throws Exception {
		Query q = em.createQuery("from Users where idUser = :idParam")
				.setParameter("idParam", id);
		Users u = new Users();
		u = (Users) q.getSingleResult();
		em.remove(u);
	}

	@Override
	public Users cekUser(Users user) throws Exception {
		Query q = em.createQuery(" from Users where username = :paramUsername and password = :paramPassword")
				.setParameter("paramUsername", user.getUsername())
				.setParameter("paramPassword", user.getPassword());
		return (Users) q.getSingleResult();
		
	}

}
