package com.exercise.java.lambda;
@FunctionalInterface
interface Interef{
	 public void  add(int a,int b);
}
@FunctionalInterface
interface Interef1{
	 public int  getLength(String s);
}
@FunctionalInterface
interface Interef2{
	 public int sqrt(int x);
}
public class Firstpro {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interef i= (a,b)-> System.out.println("the sum is :"+a+b);
	       i.add(10,10);
	       Interef1 i1= s-> s.length();
	       System.out.println( i1.getLength("harishjayram"));
	       Interef2 i2= x-> x*x;
	       System.out.println( i2.sqrt(6));

	
	}

}
