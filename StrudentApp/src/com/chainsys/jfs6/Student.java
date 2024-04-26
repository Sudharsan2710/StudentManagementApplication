package com.chainsys.jfs6;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {

	private String name;
	private int id;
	private double percentage;
	private String department;

	public Student(String name, int id, double percentage, String department) {
		super();
		this.name = name;
		this.id = id;
		this.percentage = percentage;
		this.department = department;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double percentage() {
		return percentage;
	}

	public void setpercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "AppStudent [name=" + name + ", id=" + id + ", percentage=" + percentage
				+ ", department=" + department + "]";
	}

}
