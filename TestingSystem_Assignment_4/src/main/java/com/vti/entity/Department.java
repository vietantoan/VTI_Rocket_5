package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Department", catalog = "TestingSystem")
public class Department implements Serializable {

	private static  final long serialVersionUID = 1L;
	 
	@Column( name = "DepartmentID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment - primarykey
	private short id;
	
	@Column( name = "DepartmentName", nullable = false, unique = true)
	private String name;
	
	public Department() {
		
	}
	
	public short getDepartmentID() {
		return id;
	}

	
	public void setDepartmentID(short departmentID) {
		id = departmentID;
	}

	
	public String getDepartmentName() {
		return name;
	}

	
	public void setDepartmentName(String departmentName) {
		name = departmentName;
	}

	@Override
	public String toString() {
		return "Department [DepartmentID=" + id + ", DepartmentName=" + name + "]";
	}

	public void setname(String newName) {
		// TODO Auto-generated method stub
		
	}
}
