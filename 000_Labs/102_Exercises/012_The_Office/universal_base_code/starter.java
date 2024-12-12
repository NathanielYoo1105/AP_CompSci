/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		pam.employeeToString();
		
		Employee me = new Employee(2008, "Nathan", "Yoo", 999999.99);
		me.employeeToString();
		
		michael.raiseSalary(5);
		dwight.raiseSalary(10);
		jim.raiseSalary(4);
		pam.raiseSalary(2);
		me.raiseSalary(100);
		
		System.out.println("Michael's monthly salary is " + michael.getSalary() + " and his annual salary is " + michael.getAnnualSalary());
		System.out.println("Dwight's monthly salary is " + dwight.getSalary() + " and his annual salary is " + dwight.getAnnualSalary());
		System.out.println("Jim's monthly salary is " + jim.getSalary() + " and his annual salary is " + jim.getAnnualSalary());
		System.out.println("Pam's monthly salary is " + pam.getSalary() + " and her annual salary is " + pam.getAnnualSalary());
		System.out.println("Nathan's monthly salary is " + me.getSalary() + " and his annual salary is " + me.getAnnualSalary());
		
	}
}
