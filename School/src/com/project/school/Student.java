package com.project.school;

public class Student {
	static String schoolName="Sacred Heart Convent Higher Secondary School";//accessed using the classname
	String name;// all the variables declared within the class but outside any block or method or constructor is called instance variable 
	String rollNumber;//and can be accessed using the object reference(object name)
	String standard;
	String section;
	String classTeacher;
	
	public boolean getstudentdetails(String studname, String rollnum, String std, String sec, String teacher) {
		boolean student_exist=false;//local variable cannot be accessed outside the block or method
	
		if((studname!=null) && !studname.isEmpty()) {
			
			if(rollnum!=null && !rollnum.isEmpty()) {
				name=studname;
				//System.out.println("Name: " + name);
				rollNumber=rollnum;
				standard=std;
				section=sec;
				classTeacher=teacher;
				student_exist=true;/*This value I will not be able to access outside the block,
				hence return statement is used to make the method return the value*/ 
				
			}
		
		}
				
		return student_exist;
	}
	public void display(String teacher) {
		
		if((teacher!=null) && (!teacher.isEmpty())){
			if (teacher.equals("Ram") && (schoolName.equals("Sacred Heart Convent Higher Secondary School"))) {
			 System.out.println("Name: " + name);
			 System.out.println("RollNumber: " + rollNumber);
			 System.out.println("Standard: " + standard);
			 System.out.println("Section: " + section);
			 System.out.println("ClassTeacher: " + classTeacher);
		    }
		}
		
	}
	

}
