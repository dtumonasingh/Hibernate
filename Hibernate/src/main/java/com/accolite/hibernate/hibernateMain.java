package com.accolite.hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accolite.hibernate.dao.EmployeeDao;
import com.accolite.hibernate.model.Address;
import com.accolite.hibernate.model.Employee;
import com.accolite.hibernate.model.Phone;

public class hibernateMain {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeDao employeeDao=context.getBean(EmployeeDao.class);
		Employee employee=new Employee();
//		employee.setEmpID(1);
		employee.setFirstName("varnita");
		employee.setLastName("jain");
		employee.setSalary(13000);
		
		Address add=new Address();
		add.setStreetNo("163");
		add.setCity("Delhiy");
		
		employee.setAddress(add);
		
		Set<Phone> phones= new HashSet<Phone>();
		Phone p1=new Phone();
		Phone p2=new Phone();
		p1.setNumber("9582255243");
		phones.add(p1);
		phones.add(p2);
		employee.setPhones(phones);
		
		employeeDao.save(employee);
//		employeeDao.update(employee);
		List<Employee> employeeList=employeeDao.getAllEmployee();
		System.out.println("The list is: ");
		for(Employee employeeListVar:employeeList)
		{
			System.out.println(employeeListVar);
		}
		context.close();
		
	}


}
