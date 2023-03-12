package org.student;

import org.college.College;

public class Student extends College {
	public void studentName() {
		System.out.println("Student Name: S.Sukanya");
		
	}
	public void studentDept() {
		System.out.println("Student Dept: B.Com");
		
	}
	public void studentId() {
		System.out.println("Student ID : 07");
	}
	public static void main(String[] args) {
		Student obj= new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		
		
	}

	

	
	

}
