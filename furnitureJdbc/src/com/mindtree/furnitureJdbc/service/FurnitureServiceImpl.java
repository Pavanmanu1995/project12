package com.mindtree.furnitureJdbc.service;

import java.util.List;

import com.mindtree.furnitureJdbc.dao.FurnitureDaoImpl;
import com.mindtree.furnitureJdbc.dao.IFurnitureDao;
import com.mindtree.furnitureJdbc.entity.Furniture;
import com.mindtree.furnitureJdbc.exception.customs.FurnitureDaoException;
import com.mindtree.furnitureJdbc.exception.customs.FurnitureServiceException;

public class FurnitureServiceImpl implements IFurnitureService {

	@Override
	public String addFurniture(Furniture furniture) throws FurnitureServiceException {
		IFurnitureDao dao=new FurnitureDaoImpl();
		String mess;
		try {
			mess = dao.addFurniture(furniture);
			return mess;
		} catch (FurnitureDaoException e) {
		 throw new FurnitureServiceException();
		}	
	}

	@Override
	public List<Furniture> getFurniture() throws FurnitureServiceException {
		IFurnitureDao dao=new FurnitureDaoImpl();
		try {
			List<Furniture> furnitureList=dao.getFurniture();
			return furnitureList ;
			
		} catch (Exception e) {
			throw new FurnitureServiceException();
		}
		
	}

	@Override
	public String updateFurniture(int id, String name) throws FurnitureServiceException {
		IFurnitureDao dao=new FurnitureDaoImpl();
		String mess;
		try {
			mess = dao.updateFurniture(id,name);
			return mess;
		} catch (FurnitureDaoException e) {
		 throw new FurnitureServiceException();
		}	
	}

}
