package com.beautyofplanes.ui;


import java.util.List;

import javax.annotation.ManagedBean;

import javax.inject.Inject;
import javax.inject.Named;


import org.springframework.context.annotation.Scope;

import com.beautyofplanes.dto.Plane;
import com.beautyofplanes.service.IPlaneService;


@Named
@ManagedBean
@Scope("session")
public class SearchPlanes {


	@Inject
	private Plane plane;
	
	@Inject
	private IPlaneService planeService;

	private List<Plane> planes;
	
	private Plane selectedPlane;
	
	
	
	/**
	 * Handle button clicks from searches.
	 * @return the next navigation.
	 */
	public String execute() {

			
		if (plane != null && plane.getName().equalsIgnoreCase("SAAB")){
			return "search";
		} else {
			return "noresults";
		}
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
		
	}

	public List<Plane> completePlanes(String query) {
		return planeService.filterPlanes(query);
	}

	public List<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plane> planes) {
		this.planes = planes;
	}

	public Plane getSelectedPlane() {
		return selectedPlane;
	}

	public void setSelectedPlane(Plane selectedPlane) {
		this.selectedPlane = selectedPlane;
	}


}