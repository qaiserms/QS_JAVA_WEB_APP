package com.beautyofplanes.dto;


import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;



@Named
@ManagedBean
@Scope("session")
public class Plane {
	
	private String name;
	private String genus;
	private String manufacturer;
	private String engines;
	private String capacity;
	private int guid;
	
	

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
}	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " "  + genus + "  " + manufacturer + " " + engines + " " + capacity;
	}

	public int getGuid() {
		return guid;
	}

	public void setGuid(int guid) {
		this.guid = guid;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getEngines() {
		return engines;
	}

	public void setEngines(String engines) {
		this.engines = engines;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	

}
