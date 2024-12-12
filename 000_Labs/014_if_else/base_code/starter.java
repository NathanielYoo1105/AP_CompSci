/* Lab 14
 *	Author:  Nathaniel Yoo
 *  Date: 9/11/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int randNum = rand.nextInt(1000) + 1;
		System.out.println("Enter your guess (1-1000): ");
		int guess = sc.nextInt();
		
		if(guess > randNum){
			System.out.println("Too high!");
		} else if(guess < randNum){
			System.out.println("Too low!");
		} else {
			System.out.println("Correct!");
		}
	}
}
