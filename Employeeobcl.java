package com.exercise.java.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Employeeobcl {
	
	int eno;
	String ename;

	Employeeobcl(int eno,String ename){
		this.eno=eno;
		this.ename=ename;
	}
	public String toString() {
		return eno+":::"+ename;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employeeobcl> a= new ArrayList<Employeeobcl>();
		a.add(new Employeeobcl(100,"harish100"));
		a.add(new Employeeobcl(900,"harish900"));
		a.add(new Employeeobcl(120,"harish120"));
		a.add(new Employeeobcl(500,"harish500"));
		a.add(new Employeeobcl(700,"harish700"));
		
		System.out.println(a);
		Collections.sort(a,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		System.out.println(a);
	}

}
