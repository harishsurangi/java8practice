package com.exercise.java.lambda;

import java.util.TreeSet;

public class Treesetlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeSet<Integer> l= new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
			//if u r passing any comparator  place with lambda expression
		 // because it is functional interface it is  based on CSO
		      l.add(100);
		      l.add(50);
		      l.add(300);
		      l.add(20);
		       l.add(2);
		       System.out.println(l);
	}

}
