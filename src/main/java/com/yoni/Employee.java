package com.yoni;

public class Employee {
	String name;
	int age;
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDetails() {
		return "Name =  " + this.getName() + " and Age= " + this.getAge();
	}
}