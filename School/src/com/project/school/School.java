package com.project.school;

public class School {
	public static void main(String[] args) {
		boolean doExist;
		Student stud1 = new Student();
		Student stud2 = new Student();
		doExist=stud1.getstudentdetails("Jeyam", "101", "V", "a", "Ram"); 
		if(doExist=true){
			System.out.println("Udated student data successfully!");
		}
		stud2.getstudentdetails("Mihika", "102", "V", "a", "Ram");
		
		if((stud1.classTeacher!=null) && (!stud1.classTeacher.isEmpty())) {
			//System.out.println(stud1.name);
			stud1.display("Ram");
			stud2.display("Ram");
		}
	}

}
