package com.accolite.hibernate.model;
//import java.sql.Timestamp;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="address")
public class Address {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="streetNo")
	String streetNo;
	
	@Column(name="city")
	String city;
	
	@Column(name="created_at")
//	@Temporal(TemporalType.TIMESTAMP)
	Timestamp created_at;
	
	@Column(name="updated_at")
//	@Temporal(TemporalType.TIMESTAMP)
	Timestamp updated_at;
	
//	@OneToOne(mappedBy="employee")
//	Employee employee;

	public int getId() {
		return id;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", streetNo=" + streetNo + ", city=" + city + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}


	
	
	

}
