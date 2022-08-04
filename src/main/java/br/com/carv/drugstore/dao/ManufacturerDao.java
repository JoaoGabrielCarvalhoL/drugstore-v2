package br.com.carv.drugstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;

import br.com.carv.drugstore.entities.Manufacturer;
import br.com.carv.drugstore.util.HibernateUtil;

public class ManufacturerDao {

	public void save(Manufacturer manufacturer) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			session.save(manufacturer);
			transaction.commit();
		} catch (RuntimeException ex) {
			if (transaction != null) {
				transaction.rollback();
			}
			ex.printStackTrace();
			throw ex;
		} finally {
			session.close();
		}

	}

	public List<Manufacturer> listAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Manufacturer> manufactures = null;

		try {

			

		} catch (RuntimeException ex) {
			ex.printStackTrace();
			throw ex;
		} finally {
			session.close();
		}
		return manufactures;
	}

}
