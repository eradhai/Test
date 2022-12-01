package com.project.statements;

public class IfElseStatement {
	public static void main(String[] args) {
		String record="Not Completed";
		if(record.equals("Completed")){
			System.out.println("Good Job!");
		}
			
		else if(record.equals("Not Completed")){
				
			System.out.println("Complete your Record");
			
		}
		else {
			System.out.println("Submit your Record");
		}
		
	}
	

}
