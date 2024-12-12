/*Lab 23
 *	Author:  Nathaniel Yoo
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class character{
	String role = new String("Wizard");
}

class starter {
	public static void main(String args[]) {
		character newRole = new character();
		System.out.println("You are a " + newRole.role);
		
		System.out.println("Your strength trait is 5");
		System.out.println("Your dexterity trait is 5");
		System.out.println("Your intelligence trait is 5");
		System.out.println("Your charisma trait is 5");
		
	}
}
