/*
 *	Author:  Nathaniel Yoo
 *  Date: 9/11/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 = sc.nextInt();
		System.out.println("Enter your second number");
		int num2 = sc.nextInt();
		if(num1 == num2){
			System.out.print("Your 2 numbers are equal!");
		} else {
			System.out.print("Your 2 numbers are not equal.");
		}
	}
}
