package com.exercise.java.lambda;

public class Annonlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Thread t= new Thread(()->{
        	for(int i=1;i<=10;i++) {
        		System.out.println("child thread");
        	}
        });
        t.start();
        for(int i=1;i<=10;i++) {
    		System.out.println("mian thread");
    	}
        
        
	}

}
