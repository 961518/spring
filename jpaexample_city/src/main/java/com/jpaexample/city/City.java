package com.jpaexample.city;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class City {
	
	@Id
	private long id;
	private String name;
	private String Address;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	

}