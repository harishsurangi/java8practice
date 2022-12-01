package com.exercise.java.lambda;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> l= new TreeSet<Integer>();
		//if u r not passing any comparator it is  based on DNSO like
		//Treeset<Integer>(Comparator c)
	      l.add(100);
	      l.add(50);
	      l.add(300);
	      l.add(20);
	       l.add(2);
	       System.out.println(l);
	       
	     
	}

}
