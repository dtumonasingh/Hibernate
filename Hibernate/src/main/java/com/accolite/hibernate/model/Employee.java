package com.accolite.hibernate.model;

import java.security.Timestamp;
import java.util.Set;

import javax.persistence.*;
//import java.util.Date;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="empID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empID;
	@Column(name="firstName")
	String firstName;
	@Column(name="lastName")
	String lastName;
	@Column(name="salary")
	int salary;
	
//	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_at")
	Timestamp created_at;
//	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_at")
	Timestamp updated_at;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	Address address;
	
	@OneToMany(mappedBy="employee")
	Set<Phone> phones;


	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Set<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + ", address=" + address + "]";
	}
	
	
	
	

}
