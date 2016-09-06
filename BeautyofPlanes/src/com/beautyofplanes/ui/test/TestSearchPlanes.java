package com.beautyofplanes.ui.test;

import org.junit.Test;

import com.beautyofplanes.dto.Plane;
import com.beautyofplanes.ui.SearchPlanes;

import junit.framework.TestCase;

public class TestSearchPlanes extends TestCase {

	private SearchPlanes searchPlanes;
	private String execute;


	@Test
	public void testSearchPlanesExecute() {
		giveSearchPlanesCreatedWithRedbud();
		whenInvokeExecute();
		thenVerifyReturnSuccess();
	}

	@Test
	public void testSearchPlanesNoRedbud() {
		givenSearchPlanesCreatedWithoutRedbud();
		whenInvokeExecute();
		thenVerifyReturnNoResults();
	}
	
	@Test
	public void testSearchPlanesNull() {
		givenSearchPlanesCreatdWithNullPlane();
		whenInvokeExecute();
		thenVerifyReturnNoResults();
	}
	
	private void givenSearchPlanesCreatdWithNullPlane() {
		searchPlanes = new SearchPlanes();
		
	}

	private void thenVerifyReturnNoResults() {
		// TODO Auto-generated method stub
		assertEquals("noresults", execute);
	}

	private void givenSearchPlanesCreatedWithoutRedbud() {
		// TODO Auto-generated method stub
		searchPlanes = new SearchPlanes();
		Plane Plane = new Plane();
		Plane.setName("Pawpaw");
		searchPlanes.setPlane(Plane);
	}

	private void thenVerifyReturnSuccess() {
		assertEquals("search", execute);
		
	}


	private void whenInvokeExecute() {
		execute = searchPlanes.execute();
		
	}


	private void giveSearchPlanesCreatedWithRedbud() {
		searchPlanes = new SearchPlanes();
		Plane Plane = new Plane();
		Plane.setName("Redbud");
		searchPlanes.setPlane(Plane);
	}
	
}
