package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Lieu;


public class LieuDao implements ILieuDao {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();

	@Override
	public int createLieu(Lieu lieu) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(lieu);
			session.getTransaction().commit();
			return 1;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur createLieu() ");
			return 0; 
		}
	}

	@Override
	public List<Lieu> getLieu() {
		
	
	List<Lieu> list = new ArrayList<Lieu>();
		
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			String requete= "Select * from Lieu";
			SQLQuery query = session.createSQLQuery(requete);
			query.addEntity(Lieu.class);
			list=query.list();
			return list;
		}
		catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}