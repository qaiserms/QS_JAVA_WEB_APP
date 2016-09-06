package com.beautyofplanes.service.test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.beautyofplanes.dao.IPlaneDAO;
import com.beautyofplanes.dto.Plane;
import com.beautyofplanes.service.PlaneService;

import junit.framework.TestCase;

public class TestPlaneService extends TestCase {
	
	private PlaneService PlaneService;
	private List<Plane> filterPlanes;
	private IPlaneDAO PlaneDAO;

	@Test
	public void testFilterPlanes() {
		givenThatPlaneServiceIsPopulatedWithPlaneDAO();
		whenFilterWithRed();
		thenVerifyTwoResults();
		
		
		
	}

	private void thenVerifyTwoResults() {
		// TODO Auto-generated method stub
		assertEquals(2, filterPlanes.size());
		
	}

	private void whenFilterWithRed() {
		// TODO Auto-generated method stub
		filterPlanes = PlaneService.filterPlanes("Red");
		verify(PlaneDAO, times(1)).fetchPlanes();
		
	}

	private void givenThatPlaneServiceIsPopulatedWithPlaneDAO() {
		PlaneService = new PlaneService();
		
		PlaneDAO = mock(IPlaneDAO.class);
		// a known set of hardcoded Planes.
		List<Plane> PlaneList = constructPlaneList();
		// tell the mock object to return our known set of hardcoded Planes, when requested.
		when(PlaneDAO.fetchPlanes()).thenReturn(PlaneList);

		// associate the mock object with the obejct we are testing.
		PlaneService.setPlaneDAO(PlaneDAO);
		
	}
	
	private List<Plane> constructPlaneList() {
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


}