/*
 *	Author: Nathaniel Yoo  
 *  Date: 8/29/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println(Math.max(13 - 6 * 11, 30 % 7 * (-2)));
		System.out.println(Math.sqrt(3 * 8 + 31 % 7));
		System.out.println(Math.pow(37 / 3, 35 % 21));
		System.out.println(Math.max(Math.pow(2,14%3),Math.sqrt( 2*6)));
		
		//Extra
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first double: ");
		double num1 = sc.nextDouble();
		System.out.println("ENter your second double: ");
		double num2 = sc.nextDouble();
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.sqrt(num2));
		System.out.println(Math.pow(num1, num2));
	}
}
