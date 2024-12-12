/* Lab 40
 *	Author:  Nathaniel Yoo
 *  Date: 11/19/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first and last name with a space in the middle.");
		String fullName = sc.nextLine();
		
		int spaceLocation = 0;
		boolean enteredSpace = false;
		for(int i = 0; i < fullName.length(); i++){
			if(fullName.substring(i, i+1).equals(" ")){
				spaceLocation = i;
				enteredSpace = true;
			}
		}
		if(enteredSpace){
			System.out.println("Your last name is:" + fullName.substring(spaceLocation));
		} else {
			System.out.println("You didn't enter a space!");
		}
		
	}
}
