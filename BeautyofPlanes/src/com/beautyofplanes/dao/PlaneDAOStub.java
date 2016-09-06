package com.beautyofplanes.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import com.beautyofplanes.dto.Plane;


public class PlaneDAOStub implements IPlaneDAO {
	
	static final Logger log = Logger.getLogger(PlaneDAOStub.class);

	@Override
	public List<Plane> fetchPlanes() {
		// TODO Auto-generated method stub
		List<Plane> allPlanes = new ArrayList<Plane>();

		// Create Planes and add them to the collection.
		Plane A380 = new Plane();
		A380.setName("Airbus A-380");
		A380.setManufacturer("Airbus");
		A380.setEngines("Four");
		A380.setCapacity("800");
		allPlanes.add(A380);

		Plane B737 = new Plane();
		B737.setManufacturer("Boing");
		B737.setEngines("Two");
		B737.setCapacity("170");
		allPlanes.add(B737);

		Plane SAAB2000 = new Plane();
		SAAB2000.setEngines("Two");
		SAAB2000.setCapacity("65");
		SAAB2000.setManufacturer("SAAB");
		allPlanes.add(SAAB2000);
		
		Plane B747 = new Plane();
		B747.setManufacturer("Boing");
		B747.setCapacity("500");
		B747.setEngines("Four");
		allPlanes.add(B747);
		
		return allPlanes;

	}

	public void insert(Plane plane) throws Exception {
		// TODO Auto-generated method stub
		log.warn("Inserting to stub; this does NOT persist the item"); 
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