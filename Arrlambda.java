package com.exercise.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arrlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> l= new ArrayList<Integer>();
      l.add(100);
      l.add(50);
      l.add(300);
      l.add(20);
      System.out.println("before sorting"+l);
      Collections.sort(l);
      System.out.println("after sorting"+l);
      Collections.sort(l, new Mycomparator());
     
      System.out.println("after sorting"+l);
      
	}

}
class Mycomparator  implements Comparator<Integer>{
	  public int compare(Integer i1,Integer i2) {
		  /* if (i1>i2) {
			   return -1;
		   }
		   else if (i1<i2) {
			   return +1;
		   }
		   else return 0;*/
		   return (i1>i2)?-1:(i1<i2)?+1:0;
	  }
}