package com.capg;
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
	
	public void display() {
		System.out.println("Id :"+employeeId+" "+"Name:"+employeeName+" "+"Salary:"+salary+" "+"B Unit:"+unit+" "+"Age:"+age);
	}
	
	
	
}
