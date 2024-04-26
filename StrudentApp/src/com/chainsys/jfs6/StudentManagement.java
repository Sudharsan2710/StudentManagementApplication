package com.chainsys.jfs6;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class StudentManagement {

	HashSet<Student> studentset = new HashSet<Student>();

	Student st1 = new Student("Sudharsan",3256,75,"ECE");
	Student st2 = new Student("Mani",3257,75,"ECE");
	Student st3 = new Student("Raja",3258,75.5,"ECE");
	Student st4 = new Student("Guru",3259,85.5,"MECH");
	Student st5 = new Student("Vasanth",3260,75,"AI");
	
	Scanner sc = new Scanner(System.in);
	boolean found;
	String name;
	int id;
	double percentage;
	String deparment;
	
	StudentManagementApplicationValidation v1 =new StudentManagementApplicationValidation();
	
	public StudentManagement(){
		
		studentset.add(st1);
		studentset.add(st2);
		studentset.add(st3);
		studentset.add(st4);
		studentset.add(st5);
		
	}
	//viewAllStudents
	 public void viewAllStudents() {
		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		 
	        for (Student st : studentset) {
	            System.out.println(st);
	        }
	     System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	    }
	 //viewsinglestudentdata
	 public void veiwSudent() {
		 System.out.print("Enter the ID: ");
		 
		 v1.validid(id);
		 id=sc.nextInt();
		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		 for(Student st:studentset) {
			if(st.getId()==id) {
				 System.out.println("Student found: " + st);
				 found = true;
	                return;
			}
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		 }
		 if(!found) {
			 System.out.println("Student with this id not present");
		 }
		 else {
			 System.out.println("Student found!");
		 }
	 }
	 
	 public void showStudent() {
	        System.out.print("Enter the ID of the student you want to show: ");
	        int id = sc.nextInt();
	        v1.validid(id);
	        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	        for (Student st : studentset) {
	            if (st.getId() == id) {
	                System.out.println("Student found: " + st);
	                return;
	            }
	        }
	        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	        System.out.println("Student with ID " + id + " not found.");
	    }
	 //UpdateStudent
	 
	 public void updateStudent() {
		 
	        System.out.print("Enter the ID of the student you want to update: ");
	        int id = sc.nextInt();
	        for (Student st : studentset) {
	            if (st.getId() == id) {
	            	System.out.println("What do you want to update name or id or department or percentage");
	            	String input=sc.next();
	            	 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	            	if(input.equalsIgnoreCase("name")) {
	            		System.out.print("Enter the new name: ");
		                String newname = sc.next();
		               v1.checkname(newname);
		                st.setName(newname);
		                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	            	}
	            	
	            	 else if(input.equalsIgnoreCase("id")){
	            		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	            		 System.out.print("Enter the new ID: ");
	 	                int newid = sc.nextInt();
	 	                v1.validid(newid);
	 	                st.setId(newid);
	 	               System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	            	 }
	            	 else if(input.equalsIgnoreCase("department")) {
	            		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	            		 System.out.print("Enter the new Department: ");
	 	                String newdepartment = sc.next();
	 	                v1.validdepartment(newdepartment);
	 	                st.setDepartment(newdepartment);
	 	               System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	            		 }
	            	 else if( input.equalsIgnoreCase("percentage")){
	            		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	            		System.out.print("Enter the new percentage: ");
	 	                double newPercentage = sc.nextDouble();
	 	                v1.validpercencentage(newPercentage);
	 	                st.setpercentage(newPercentage); 
	 	               System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");	 
	            	 }
	            	 else if(input.equalsIgnoreCase("all")) {
	            		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	            	System.out.print("Enter the new percentage: ");
	                double newPercentage = sc.nextDouble();
	                v1.validpercencentage(newPercentage);
	                st.setpercentage(newPercentage);
	                System.out.print("Enter the new name: ");
	                String newname = sc.next();
	                v1.checkname(newname);
	                st.setName(newname);
	                System.out.print("Enter the new ID: ");
	                int newid = sc.nextInt();
	                v1.validid(newid);
	                st.setId(newid);
	                System.out.print("Enter the new Department: ");
	                String newdepartment = sc.next();
	                v1.validdepartment(newdepartment);
	                st.setDepartment(newdepartment);
	                System.out.println("Student updated successfully: " + st);
	                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	                return;
	            	
	            	}
	            	
	                
	            	 else {
	            		 System.out.println("Student with ID " + id + " not found.");
	            	 }
	            	System.out.println("Sucessfully updated");	 
	            }
	        }
	    
	    }
	 //deletestudentdata
	    public void deleteStudent() {
	        System.out.print("Enter the ID of the student you want to delete: ");
	        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	        int id = sc.nextInt();
	        
	        v1.validid(id);
	        for (Student st : studentset) {
	            if (st.getId() == id) {
	                studentset.remove(st);
	                System.out.println("Student deleted successfully.");
	                return;
	                
	            }
	            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	        }
	        
	        System.out.println("Student with ID " + id + " not found.");
	    }
	 }
	 

	 

