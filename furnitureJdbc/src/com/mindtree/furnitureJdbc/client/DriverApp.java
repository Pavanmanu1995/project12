package com.mindtree.furnitureJdbc.client;

import java.util.List;
import java.util.Scanner;

import com.mindtree.furnitureJdbc.entity.Furniture;
import com.mindtree.furnitureJdbc.exception.customs.FurnitureServiceException;
import com.mindtree.furnitureJdbc.service.FurnitureServiceImpl;
import com.mindtree.furnitureJdbc.service.IFurnitureService;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IFurnitureService ser=new FurnitureServiceImpl();
		boolean flag=true;
		do
		{
			System.out.println("1.add furniture");
			System.out.println("2.retrive furtinure detalis");
			System.out.println("3.update furniture details");
			System.out.println("4.delete furniture details");
			System.out.println("5.exit");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the furniture id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the furniture name");
				String name=sc.nextLine();
				System.out.println("enter the furniture cost");
				double cost=sc.nextDouble();
				System.out.println("enter the furniture quantity");
				int quantity=sc.nextInt();
				Furniture furniture=new Furniture(id,name,cost,quantity);
				
				try {
					String mess = ser.addFurniture(furniture);
					System.out.println(mess);
				} catch (FurnitureServiceException e) {
					System.out.println("something went wrong");
				}
				break;
			case 2:
				try {
					List<Furniture> furnitureList=ser.getFurniture();
					for(Furniture e:furnitureList)
					{
						System.out.println(e.toString());
					}
				} catch (FurnitureServiceException e) {
					System.out.println("something went wrong");
				}
				break;
			case 3:
				System.out.println("enter the id to update");
				id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the name to update");
				name=sc.nextLine();
				try {
					String mess = ser.updateFurniture(id,name);
					System.out.println(mess);
				} catch (FurnitureServiceException e) {
					System.out.println("something went wrong");
				}
				try {
					List<Furniture> furnitureList=ser.getFurniture();
					for(Furniture e:furnitureList)
					{
						System.out.println(e.toString());
					}
				} catch (FurnitureServiceException e) {
					System.out.println("something went wrong");
				}
				break;
				
				
				
				
			}
		}
		while(flag);
		

	}

}
