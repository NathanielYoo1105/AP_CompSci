/*
 *	Author: Nathaniel Yoo
 *  Date: 8/29/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this pr
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String fn = sc.nextLine();
		System.out.println("Your first name is " + fn);
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("You are " + age);
		System.out.println("What is your birthday month? (Number)");
		int month = sc.nextInt();
		System.out.println("What is your birthday day?");
		int day = sc.nextInt();
		System.out.println("What is your birthday year?");
		int year = sc.nextInt();
		System.out.println("You were born on " + month + " " + day + " " + year);
		System.out.println("How much is a buck fifty?");
		double buck = sc.nextDouble();
		System.out.println("A buck fifty is " + buck);
	}
}
