package com.beautyofplanes.ui;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.beautyofplanes.dto.Plane;
import com.beautyofplanes.service.IPlaneService;

@Named
@ManagedBean
@Scope("session")
public class AddPlane {
	
	final static Logger logger = Logger.getLogger(AddPlane.class);

	
	private Plane plane;
	
	@Autowired
	private IPlaneService planeService;
	
	private String message = "foo";

	public String execute() {
		logger.info("Entering the Execute method");
		String returnValue = "";
		
		// get faces context
		FacesContext currentInstance = FacesContext.getCurrentInstance();
					
		try {
			planeService.save(plane);
			
			logger.info("Save successful " + plane.toString());
			
			// what is the message that we want to show?
			FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", "Plane Saved");
			// display the message
			currentInstance.addMessage(null, fm);
			
		} catch (Exception e) {
			logger.error("Error while saving Plane.  Message: " + e.getMessage());
			
			e.printStackTrace();
			returnValue = "fail";
			
			// what is the message that we want to show?
			FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unable to Save", "Plane not Saved");
			// display the message
			currentInstance.addMessage(null, fm);
						
		}
		return returnValue;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public IPlaneService getPlaneService() {
		return planeService;
	}

	public void setPlaneService(IPlaneService planeService) {
		this.planeService = planeService;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}