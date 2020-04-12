package com.lawencon.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseHibernate {
	@PersistenceContext
	protected EntityManager em;
}
