package com.exercise.java.lambda;

import java.util.TreeMap;

public class Tremaplambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> m= new  TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
	       m.put(100, "harish100");
	       m.put(600, "harish600");
	       m.put(300, "harish300");
	       m.put(700, "harish700");
	       m.put(500, "harish500");
	       m.put(900, "harish900");
	       System.out.println(m);
		}
	}


