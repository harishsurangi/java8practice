package com.exercise.java.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class User {
	
	String username;
	String pwd;

	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Predicate<User> p= u->u.username.equals("durga")&&u.pwd.equals("java");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user name");
        String username = sc.next();
        System.out.println("enter password");
        String pwd = sc.next();
       User user = new User(username,pwd);
        if(p.test(user)) {
        	System.out.println("valid user");
        }else  System.out.println("invalid useer try again");
        
	}

}
