package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//System.out.println("=== TEST 1: department insert ====");
		Department department = new Department();
		/*
		departmentDao.insert(department);
		System.out.println("Sucess! Department adicted!");
		
		System.out.println("=== TEST 2: department delete ====");
		System.out.println("Select wich id do you want to delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department deleted!!");
		*/
		/*
		System.out.println("=== TEST 3: department update  ====");
		Department department2 = new Department();
		department2 = departmentDao.findById(1);
		department2.setName("Drugs");
		departmentDao.update(department2);
		System.out.println("Upadate completed!!");
		*/
		System.out.println("=== TEST 4: department findAll  ====");
		List<Department> list = departmentDao.findAll();
		
		for(Department d : list) {
			System.out.println(d);
		}
		
		department = departmentDao.findById(13);
		System.out.println();
		System.out.println(department);
		
		
		sc.close();
	}

}
