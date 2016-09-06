package com.beautyofplanes.service;


import java.util.List;


import com.beautyofplanes.dto.Plane;


/**
 * IPlaneService includes all business related functions for a Plane and related entities
 * @author Brandan Jones
 *
 */
public interface IPlaneService {

	/**
	 * Return a collection of Plane objects that contain the given filter text.
	 * @param filter a substring that should be contained in returned Planes.
	 * @return a collection of matching Planes.
	 */
	public List<Plane> filterPlanes(String filter);

	/**
	 * Save the Plane and perform a validation check.
	 * @param Plane the Plane we are persisting
	 * @throws Exception if unable to save
	 */
	void save(Plane plane) throws Exception;

	/**
	 *  Return a list of Planes that match the given search criteria
	 * @param Plane a parameter that contains the search criteria
	 * @return a list of matching Planes
	 */
		

	
}