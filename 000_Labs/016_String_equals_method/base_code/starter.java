/* Lab 16
 *	Author: Nathaniel Yoo 
 *  Date: 9/16/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior or Rouge?");
		String role = sc.nextLine();
		if (role.equals("Wizard")){
			System.out.println("You are a Wizard");
		} else if (role.equals("Warrior")){
			System.out.println("You are a Warrior");
		} else if (role.equals("Rouge")){
			System.out.println("You are a Rouge");
		} else{
			System.out.println("You didn't choose a valid role");
		}
	}
}
