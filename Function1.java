package com.exercise.java.lambda;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Function<String,Integer> f= s->s.length();
      System.out.println(f.apply("Harish"));   
      
      String s9= "harish is a very good boy";
      Function<String,String> f1= s1->s1.replaceAll(" ","");
      System.out.println(f1.apply(s9));
      
     String s4= " harish is a very good boy ";
      Function<String,Integer> f2= s3->(s3.length())-(s3.replaceAll(" ","").length());
      System.out.println(f2.apply(s4));
	}

}
