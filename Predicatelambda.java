package com.exercise.java.lambda;

import java.util.function.Predicate;

public class Predicatelambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Predicate<Integer> p= i->i>10;
         System.out.println(p.test(1000));
         System.out.println(p.test(1));
         
	}

}
