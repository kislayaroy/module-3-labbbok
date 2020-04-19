package com.capg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${Employee.id}")
	private int employeeId;
	
	@Value("${Employee.name}")
	private String employeeName;
	
	@Value("${Employee.salary}")
	private double salary;
	
	@Value("${Employee.bu}")
	private String unit;
	
	@Value("${Employee.age}")
	private int age;

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	private SBU businessUnit;
	
	public SBU getSbu() {
		return businessUnit;
	}
	
	@Autowired
	public void setSbu(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public Employee() {
		
	}
	public Employee(SBU businessUnit) {
		this.businessUnit=businessUnit;
	}
	
	public void display() {
		System.out.println("Id :"+employeeId+" "+"Name:"+employeeName+" "+"Salary:"+salary+" "+"B Unit:"+unit+" "+"Age:"+age);
	}
	
	public SBU getSbuDetails() {
		SBU sbu = new SBU();
		sbu.setSbuId("PES-BU");
		sbu.setSbuName("Product Engineering Services");
		sbu.setSbuHead("Kiran Rao");
		return sbu;
	}
	
}
