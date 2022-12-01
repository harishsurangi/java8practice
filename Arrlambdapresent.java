package com.exercise.java.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Arrlambdapresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l= new ArrayList<Integer>();
	      l.add(100);
	      l.add(50);
	      l.add(300);
	      l.add(20);
	      System.out.println("before sorting"+l);
	      Collections.sort(l);
	      Collections.sort(l, (I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
	      System.out.println("after  sorting"+l);
	}

}
