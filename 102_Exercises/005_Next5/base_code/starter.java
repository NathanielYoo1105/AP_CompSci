/*
 *	Author: Nathaniel Yoo
 *  Date: 9/11/2024
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num1 = sc.nextInt();
		double num2 = num1;
		System.out.println("Here are the next 5 numbers!");
		System.out.println(num1 + ", " + (num1 +1) + ", " + (num1 +2) + ", " + (num1 +3) + ", " + (num1 +4) + ", " + (num1 + 5));
		System.out.println("Here are the next 5 multiples of " + num1 + " !");
		System.out.println(num1 + ", " + (num1 *2) + ", " + (num1 *3) + ", " + (num1 *4) + ", " + (num1 *5) + ", " + (num1 *6));
		System.out.println("Here is " + num1 + " divided by 100!");
		System.out.println((num2/100));
		System.out.println("Here is " + num1 + " divided by 10!");
		System.out.println((num2/10));
		
		


	}
}
