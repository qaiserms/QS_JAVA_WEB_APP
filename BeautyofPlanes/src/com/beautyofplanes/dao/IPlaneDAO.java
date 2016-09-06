package com.beautyofplanes.dao;


import java.util.List;

import com.beautyofplanes.dto.Plane;

public interface IPlaneDAO {
	
	public List<Plane> fetchPlanes();
	
	public void insert(Plane plane) throws Exception;
	
	public void update (Plane plane) throws Exception;
	
	public void delete (Plane plane) throws Exception;

	}