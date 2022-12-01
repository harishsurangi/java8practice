package com.exercise.java.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Function4employee {
	String name;
	Double salary;
	
	public Function4employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		   return name+":"+salary;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Function4employee> e= new ArrayList<Function4employee>();
       Populate(e);
       System.out.println("before increment");
       
       
	}   
	private static void Populate(ArrayList<Function4employee> e) {
		// TODO Auto-generated method stub
		e.add(new Function4employee("surangi",10000));
		e.add(new Function4employee("surangi1",15000));
		e.add(new Function4employee("surangi2",25000));
	}

}
