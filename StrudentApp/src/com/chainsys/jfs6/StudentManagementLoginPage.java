package com.chainsys.jfs6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class StudentManagementLoginPage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		StudentManagementApplicationValidation obj = new StudentManagementApplicationValidation();
		System.out.println(
				"-----------------------> LOGIN PAGE<------------------------------------------------");

		System.out.print("USER NAME:              ");

		String userName = input.next();
		StudentManagementApplicationValidation.checkusername(userName);

		System.out.print("PASSWORD:               ");
		String password = input.next();
		StudentManagementApplicationValidation.checkpassword(password);
		
		System.out.println(
				"----------------------->WELCOME TO THE STUDENT MANAGEMENT LOGIN PAGE<------------------------------------------------");
	            System.out.println("\n\t\t1.Add Student" +
	                    "\n\t\t2.Show  Student" +
	                    "\n\t\t3.Update Student"+
	                    "\n\t\t4.Delete Student" +
	                    "\n\t\t5.View All Student"+
	                    "\n\t\t6.Exit");
	            
		 
		StudentManagement sm = new StudentManagement();
		
		
		
           do {
        	   System.out.println("Enter your choice");
        	   int ch = input.nextInt();
        	   switch(ch) {
        	   
        	   case 1:
        		   System.out.println("Add Student");
        		   
        		   break;
        		   
        	   case 2:
        		   System.out.println("Veiw Student");
        		   sm.veiwSudent();
        		   break;
        		   
        		   
        	   case 3:
        		   System.out.println("Update Student");
        		   sm.updateStudent();
        		   break;
        		   
        	   case 4:
        		   System.out.println("Delete Student");
        		   sm.deleteStudent();
        		   break;
        		   
        	   case 5:
        		   System.out.println("Veiw All Student");
        		   sm.viewAllStudents();
        		   break;
        		   
        	   case 6:
        		   System.out.println("THANK YOU FOR USING THE APPLICATION");
        		   System.exit(0);
        		   break;
        		   
        	   default:
        		   System.out.println("please enter the valid choice");
        		   break;
        	   
           }
           }
        	   while(true);
    
	}
}
	


  