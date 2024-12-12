/* Lab 20
 *	Author:  Nathaniel Yoo
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess a number 1 - 1000!");
		int randNum = (int)(Math.random() * 999 + 1);
		int guess = 0;
		
		while(true){
			System.out.print("Enter your guess: ");
			guess = sc.nextInt();
			
			if(guess == randNum){
				System.out.println("You got it!");
				break;
			} else {
				System.out.println("Try again!");
			}
			
		}
		
	}
}
