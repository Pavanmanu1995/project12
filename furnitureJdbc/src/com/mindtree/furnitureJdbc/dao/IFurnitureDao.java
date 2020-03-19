package com.mindtree.furnitureJdbc.dao;

import java.util.List;

import com.mindtree.furnitureJdbc.entity.Furniture;
import com.mindtree.furnitureJdbc.exception.customs.FurnitureDaoException;
import com.mindtree.furnitureJdbc.exception.customs.FurnitureServiceException;

public interface IFurnitureDao {
	public String addFurniture(Furniture furniture) throws FurnitureDaoException;
	List<Furniture> getFurniture() throws FurnitureDaoException;
	public String updateFurniture(int id,String name) throws FurnitureDaoException;
	

}
