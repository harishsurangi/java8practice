package com.exercise.java.lambda;

import java.util.ArrayList;

public class Employeeee {
	
	
	String name;
	String designation;
	double salary;
	String city;
	

	public Employeeee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
/*	public String toString() {
		String s= String.format("%s,%s,%.2f,%s",name,designation,salary,city);
		return s;
	}*/
	public String toString() {
		return name+":"+designation+":"+salary+":"+city;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Employeeee> list = new ArrayList<Employeeee>();
      Employeeee e1= new Employeeee("harish","ceo",1000000,"srikakulam");
      list.add(e1);
      System.out.println(list);
      list.add(new Employeeee("harish2","ceo2",999999,"srikakulam2"));
      System.out.println(list);
	}

}
