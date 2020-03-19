package com.mindtree.furnitureJdbc.service;

import java.util.List;

import com.mindtree.furnitureJdbc.entity.Furniture;
import com.mindtree.furnitureJdbc.exception.customs.FurnitureServiceException;

public interface IFurnitureService {
	public String addFurniture(Furniture furniture) throws FurnitureServiceException;
	List<Furniture> getFurniture() throws FurnitureServiceException;
	public String updateFurniture(int id,String name) throws FurnitureServiceException;
	

}
