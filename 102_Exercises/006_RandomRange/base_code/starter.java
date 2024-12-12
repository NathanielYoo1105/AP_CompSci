/*
 *	Author: Nathaniel Yoo
 *  Date: 9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int min = sc.nextInt();
		System.out.println("Enter your second number (Larger than your first): ");
		int max = sc.nextInt();
		int range = max - min;
		
		System.out.println("\nYour range is from " + min + " to " + max +".");
		System.out.println("Here are 5 numbers generated in that range.");
		
		int num1 = (int)(Math.random() * range)  + min;
		int num2 = (int)(Math.random() * range)  + min;
		int num3 = (int)(Math.random() * range)  + min;
		int num4 = (int)(Math.random() * range)  + min;
		int num5 = (int)(Math.random() * range)  + min;
		
		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
		
	}
}
