package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		/*
		System.out.println("=== TEST 1: department insert ====");
		Department deparment = new Department(2, "Law");
		departmentDao.insert(deparment);
		System.out.println("Sucess! Department adicted!");
		*/
		System.out.println("=== TEST 1: department delete ====");
		System.out.println("Select wich id do you want to delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department deleted!!");
		
		
		sc.close();
	}

}
