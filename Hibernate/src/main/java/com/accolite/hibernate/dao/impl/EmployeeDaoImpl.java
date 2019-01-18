package com.accolite.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.accolite.hibernate.dao.EmployeeDao;
import com.accolite.hibernate.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private SessionFactory sessionfactory;
	public boolean save(Employee E) {
		Session session=this.sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(E);
		tx.commit();
		session.close();
		return true;
	}

	public void setSessionFactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		Session session=this.sessionfactory.openSession();
	
		List<Employee> employee= (List<Employee>)session.createQuery("from Employee").list();
		session.close();
		return employee;
	}

	public boolean delete(int employeeID) {
		Session session=this.sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Employee E=(Employee)session.load(Employee.class, employeeID);
		if(E!=null)
		{
			session.delete(E);
		}
		tx.commit();
		session.close();
		return true;
	}
	public Employee findByID(int employeeID) {
		Session session=this.sessionfactory.openSession();
		Employee E=(Employee)session.load(Employee.class, employeeID);
		if(E!=null)
		{
			System.out.println(E);
			session.close();
			System.out.println("Employee found");
			return E;
			
		}
		else
		{
			session.close();
			System.out.println("Employee not found");
			
		}
		
		return null;		
	}

	public boolean update(Employee E) {
		Session session=this.sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Employee E1=(Employee)session.load(Employee.class, E.getEmpID());
		if(E1!=null)
		{
			session.update(E);
		}
		tx.commit();
		session.close();
		return true;
	}

}
