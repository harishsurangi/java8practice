package com.exercise.java.lambda;

import java.util.ArrayList;
import java.util.function.Function;

public class Function3employee {
	
	String name;
	Double salary;
	

	public Function3employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
   public String toString() {
	   return name+":"+salary;
   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Function3employee> e= new ArrayList<Function3employee>();
     e.add(new Function3employee("surangi",100000));
     Populate(e);
     System.out.println(e);
     Function<ArrayList<Function3employee>,Double> f= l->{
    	 double total=0;
    	 for(Function3employee i:e) {
    		 total =total+i.salary;
    	 }return total;
     };
     System.out.println(f.apply(e));
	}



	private static void Populate(ArrayList<Function3employee> e) {
		// TODO Auto-generated method stub
	    e.add(new Function3employee("harish",100000));
	    e.add(new Function3employee("harish2",500000));
	}

}
