package com.beautyofplanes.dao;



import java.util.List;

import javax.inject.Named;

import org.hibernate.Session;

import com.beautyofplanes.dto.Plane;

public class PlaneHbmDAO  implements IPlaneDAO {

	@Named("planeDAO")
	
	@Override
	public List<Plane> fetchPlanes() {
		
		return null;
	}
	

	@Override
	public void insert(Plane plane) throws Exception {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(plane);
		session.getTransaction().commit();
		

	}

	@Override
	public void update(Plane plane) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Plane plane) throws Exception {
		// TODO Auto-generated method stub

	}
	
	

}