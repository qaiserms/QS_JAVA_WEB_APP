package com.beautyofplanes.service;


import java.util.ArrayList;

import java.util.List;


import javax.inject.Inject;
import javax.inject.Named;


import com.beautyofplanes.dao.IPlaneDAO;


import com.beautyofplanes.dto.Plane;




@Named
public class PlaneService implements IPlaneService {

	@Inject
	private	IPlaneDAO planeDAO;
	
	private List<Plane> allPlanes;
	
	@Override
	public List<Plane> filterPlanes(String filter) {
		
		if (allPlanes == null ) {
			allPlanes = getPlaneDAO().fetchPlanes();
		}
		
		// the collection we are returning.
		List<Plane> returnPlanes = new ArrayList<Plane>();

		// filter the list.
		// interview all possible Planes (allPlanes), and move Planes that contain the filter text into our subset collection (returnPlans)
		for (Plane plane : allPlanes) {
			if (plane.toString().contains(filter)) {
				// this Plane matches our criteria, so add it to the collection that will be returned from this method.
				returnPlanes.add(plane);
			}
		}
		
		// TODO Auto-generated method stub
		return returnPlanes;
	}
	
	public void save(Plane plane) throws Exception {
		
		if (plane.getName() == null || plane.getName().isEmpty()) {
			throw new Exception ("Name required");
		} 	
		planeDAO.insert(plane);
	
	}
	
	public IPlaneDAO getPlaneDAO() {
		return planeDAO;
	}

	public void setPlaneDAO(IPlaneDAO planeDAO) {
		this.planeDAO = planeDAO;
	}

	
	
	
}