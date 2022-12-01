package com.exercise.java.lambda;

import java.util.function.Predicate;

public class Lambdapractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] names = {"sunny","kajol","mallika","katrina","kareena"};
        Predicate<String> p= s-> s.charAt(0)=='k';
	}

}
