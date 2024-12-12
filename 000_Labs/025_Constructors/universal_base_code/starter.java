/*Lab 25
 *	Author: Nathaniel Yoo 
 *  Date: 9/26/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		BaseClass test = new BaseClass();
		System.out.println("Your role is " + test.role);
		System.out.println("Your strength trait is 5");
		System.out.println("Your dexterity trait is 5");
		System.out.println("Your intelligence trait is 5");
		System.out.println("Your charisma trait is 5");
		
		System.out.println("------------------------------------------------");
		
		System.out.println("What class would you like to be?");
		String x = sc.nextLine();
		BaseClass test2 = new BaseClass(x);
		
		System.out.println("Your role is " + test2.role);
		System.out.println("Your strength trait is 5");
		System.out.println("Your dexterity trait is 5");
		System.out.println("Your intelligence trait is 5");
		System.out.println("Your charisma trait is 5");


		
	}
}
