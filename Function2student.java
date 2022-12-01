package com.exercise.java.lambda;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function2student {
	
	String name;
	int marks;

	public Function2student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Function2student> l= new ArrayList<Function2student>();
		populate(l);
		
		System.out.println(l);
		Function<Function2student,String> f= s->{
			int marks=s.marks;
			if(marks>=80) {
				return "A[distinction]";
			}
			else if(marks>=60) {
				return "B[first class]";
			}
			else if(marks>=50) {
				return "C[second class]";
			}
			else if(marks>=35) {
				return "D[thied class]";
			}
			else {
				return "fail";
			}
		};
		
		Predicate<Function2student> p =s->s.marks>=60;
		
		for(Function2student s: l) {
			if(p.test(s))
			{	
			System.out.println("student name:"+s.name);
			System.out.println("student marks:"+s.marks);
			System.out.println("student grade:"+f.apply(s));
			System.out.println();
			}
			
		}
		

	}

	private static void populate(ArrayList<Function2student> l) {
		// TODO Auto-generated method stub
		l.add(new Function2student("bunny",65));
		l.add(new Function2student("sunny",100));
		l.add(new Function2student("chinny",55));
		l.add(new Function2student("vinny",45));
		l.add(new Function2student("pinny",25));
	}

}
