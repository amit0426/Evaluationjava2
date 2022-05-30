package com.Problem4;

public class Main {

	
	public static Person generatePerson(Student student)
	{
		return student;
		
	}
	
	public static void main(String[] args) {
		
//		Student s = new Student();
		
		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Teacher());
		System.out.println(newStudent);
		System.out.println(newTeacher);
	}
	
}
