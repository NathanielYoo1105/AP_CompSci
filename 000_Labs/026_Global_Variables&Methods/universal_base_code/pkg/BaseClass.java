/*
 *	Author:  Nathaniel Yoo
 *  Date: 9/26/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public String role;

	public BaseClass() {
		role = new String("No Role");
	}
	
	public BaseClass(String a) {
		if (a.equals("Wizard")){
			role = "Wizard";
			System.out.println("You've chosen the Wizard! Excelsior!");
		} else if (a.equals("Warrior")){
			role = "Warrior";
			System.out.println("You've chosen the Warrior! For honor!");
		} else if (a.equals("Rogue")){
			role = "Rogue";
			System.out.println("You've chosen the Rogue! How cunning!");
		} else {
			role = "No Role";
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
	}
	
	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is 5");
		System.out.println("Your dexterity trait is 5");
		System.out.println("Your intelligence trait is 5");
		System.out.println("Your charisma trait is 5");
	}

}

