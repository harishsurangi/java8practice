package com.exercise.java.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class Function4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Function<Integer,Integer> f1=i->i+i;
		 Function<Integer,Integer> f2=i->i*i*i;
		 System.out.println(f1.andThen(f2).apply(2)); 
		 System.out.println(f1.compose(f2).apply(2));
		
		
		
       Scanner sc= new Scanner(System.in);
        System.out.println( "enter your user name");
         String user = sc.next();
         System.out.println( "enter your password");
         String pwd = sc.next();
         
          
          Function<String,String> f3= s->s.substring(0,5);
          Function<String,String> f4= s->s.toLowerCase();
          if(f3.andThen(f4).apply(user).equals("durga")&& pwd.equals("java"))
          {
        	  System.out.println("valid user"); 
          }
          else {
        	  System.out.println("invalid user");
          }
          sc.close();
         
	}

}
