package com.exercise.java.lambda;


import java.util.Date;
import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Supplier<Date>  s=()-> new Date();
      System.out.println(s.get());
        
      Supplier<String>  s1=()-> {
    	  String[] s2= {"sunny","bunny","chinny","munny"};
    	  int x= (int)(Math.random()*4) ;
    	  return s2[x];};
    	  System.out.println(s1.get());
		
      
      
      
      
	}

}
