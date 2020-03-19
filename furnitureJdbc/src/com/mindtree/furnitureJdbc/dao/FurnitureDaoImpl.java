package com.mindtree.furnitureJdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.furnitureJdbc.entity.Furniture;
import com.mindtree.furnitureJdbc.exception.customs.FurnitureDaoException;
import com.mindtree.furnitureJdbc.exception.customs.FurnitureServiceException;
import com.mindtree.furnitureJdbc.utility.DBConnection;

public class FurnitureDaoImpl implements IFurnitureDao {
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static Connection con=null;

	@Override
	public String addFurniture(Furniture furniture) throws FurnitureDaoException {
		con=DBConnection.getConnection();
		try {
			ps=con.prepareStatement("insert into furniture values(?,?,?,?)");
			ps.setInt(1,furniture.getId());
			ps.setString(2, furniture.getName());
			ps.setDouble(3,furniture.getCost());
			ps.setInt(4,furniture.getQuantity());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			throw new FurnitureDaoException();
		}
		return "Furniture details added successfully";
	}

	@Override
	public List<Furniture> getFurniture() throws FurnitureDaoException {
		List<Furniture> furnitureList=new ArrayList<>();
		con=DBConnection.getConnection();
		try {
			ps=con.prepareStatement("select * from furniture");
			rs=ps.executeQuery();
			while(rs.next())
			{
				furnitureList.add(new Furniture(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)));
				
			}
			return furnitureList ;
		} catch (SQLException e) {
			throw new FurnitureDaoException();
		}
		
		
	}

	@Override
	public String updateFurniture(int id, String name) throws FurnitureDaoException {
		con=DBConnection.getConnection();
			try {
				ps=con.prepareStatement("update furniture set name=? where id=?");
				ps.setString(1,name);
				ps.setInt(2, id);
				ps.executeUpdate();
				con.close();
			} catch (SQLException e) {
				throw new FurnitureDaoException();
				
			}
			return "updated successfully";
	}
	}

