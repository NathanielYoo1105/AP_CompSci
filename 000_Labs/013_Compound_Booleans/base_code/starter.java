/*
 *	Author:  Nathaniel Yoo
 *  Date: 9/11/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter your 2nd number");
		int num2 = sc.nextInt();
		System.out.println("Enter your 3rd number");
		int num3 = sc.nextInt();
		if(num1 > num2){
			if(num1 > num3){
				System.out.println(num1 + " is your largest number.");
			} else {
				System.out.println(num3 + " is your largest number.");
			}
		} else {
			if(num2 > num3){
				System.out.println(num2 + " is your largest number.");
			} else {
				System.out.println(num3 + " is your largest number.");
			}
		}
		
		if(num1 < num2){
			if(num1 < num3){
				System.out.println(num1 + " is your smallest number.");
			} else {
				System.out.println(num3 + " is your smallest number.");
			}
		} else {
			if(num2 < num3){
				System.out.println(num2 + " is your smaller number.");
			} else {
				System.out.println(num3 + " is your smaller number.");
			}
		}
	}
}
