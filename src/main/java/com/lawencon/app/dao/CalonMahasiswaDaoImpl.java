package com.lawencon.app.dao;

import java.util.List;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.app.model.CalonMahasiswa;

@Repository
public class CalonMahasiswaDaoImpl extends BaseHibernate implements CalonMahasiswaDao {

	@Override
	public void addCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception {
		em.persist(calonMahasiswa);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CalonMahasiswa> getCalonMahasiswa() throws Exception {
		Query q = em.createQuery("from CalonMahasiswa");
		return q.getResultList();
	}

	@Override
	public void updateCalonMahasiswa(CalonMahasiswa calonMahasiswa) throws Exception {
		em.merge(calonMahasiswa);
	}

	@Override
	public void deleteCalonMahasiswa(Integer id) throws Exception {
		Query q = em.createQuery(" from CalonMahasiswa where idCalonMhs = :idParam");
		q.setParameter("idParam", id);
		CalonMahasiswa temp = new CalonMahasiswa();
		temp = (CalonMahasiswa) q.getSingleResult();
		em.remove(temp);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CalonMahasiswa> getCalonMahasiswaAcc() throws Exception {
		Query q = em.createQuery(" from CalonMahasiswa where status = :param")
				.setParameter("param","TERIMA");
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CalonMahasiswa> getCalonMahasiswaReject() throws Exception {
		Query q = em.createQuery(" from CalonMahasiswa where status = :param")
				.setParameter("param","TOLAK");
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CalonMahasiswa> getCalonMahasiswaPending() throws Exception {
		Query q = em.createQuery(" from CalonMahasiswa where status = :param")
				.setParameter("param","PENDING");
		return q.getResultList();
	}

}
