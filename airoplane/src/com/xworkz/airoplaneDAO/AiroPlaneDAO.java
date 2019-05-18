package com.xworkz.airoplaneDAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.airoplaneDTO.AiroPlaneDto1;

import singleTonFactory.HibernateUtil;



public class AiroPlaneDAO {
	
	public AiroPlaneDAO() {
		System.out.println( this.getClass().getSimpleName()+"created");
	}
	public void save(AiroPlaneDto1 airoPlaneDto) {
		
		Session sess=HibernateUtil.getFactory().openSession();
		
		/*
		 * Configuration configuration =new Configuration(); configuration.configure();
		 * configuration.addAnnotatedClass(AiroPlaneDTO.class);
		 * 
		 * SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session =sessionFactory.openSession(); */
		Transaction tx=sess.beginTransaction();
		sess.persist(airoPlaneDto);
		tx.commit();
		sess.close();
		
	}
	
	public List<AiroPlaneDto1> getAll( ) {
		Session sess=HibernateUtil.getFactory().openSession();
		String hql="from AiroPlaneDto1 dto";
		Query query=sess.createQuery(hql);
		
		List<AiroPlaneDto1> airoPlaneDtos=query.list();
		return airoPlaneDtos;
		
	}

	
	public int  updateAiroPlaneBySeatCap( String seatCap, String airoplaneName) {
		Session sess=null;
		try {
			 sess=HibernateUtil.getFactory().openSession();
			/*
			 * String hql="update AiroPlaneDto1 set airoplaneID='"
			 * +airoplaneId+"'where seatCapacity='"+seatCap+"'";
			 */
			 
			 Query query=sess.getNamedQuery("updateQuery");//for named query:we write query in dto class as @NamedQuery
			 
			/*
			 * String
			 * hql="update AiroPlaneDto1 set airoplaneName=:an where seatCapacity=:sc";
			 * Query query=sess.createQuery(hql);
			 */
			
			query.setParameter("an", airoplaneName);
			query.setParameter("sc", seatCap);
			
			int count=	query.executeUpdate();
			System.out.println(count);
			
		}
		catch(HibernateException e){
			e.printStackTrace();
			
		}
		finally {
			sess.close();
		}
		return 0;
		
		
	}
	
	public List<Object[]> fetchByAiroPlaneName(String airoplaneName) {
		Session sess=HibernateUtil.getFactory().openSession();
		String hql=" select airoplaneType,engineType from AiroPlaneDto1 dto where airoplaneName='"+airoplaneName+ "'";
		Query query=sess.createQuery(hql);
		
		List<Object[]> airoPlaneDtos=(List<Object[]>) query.uniqueResult();
		/*
		 * for (Object object : airoPlaneDtos) { System.out.println(object); }
		 */
		
		return  airoPlaneDtos;
		
	}

}
