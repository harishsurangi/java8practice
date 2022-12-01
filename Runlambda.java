package com.exercise.java.lambda;

public class Runlambda {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       Runnable r= ()->{
    	   for(int i =1;i<=10;i++) {
    		   System.out.println("child thread");
    		   
    	   }
       };
        Thread t= new Thread(r);
        t.start();
        for(int i =1;i<=10;i++) {
 		   System.out.println("main  thread");
 		   
 	   }
	}

}
