/* Dog
 *	Author: Nathaniel Yoo
 *  Date: 10/21/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog dog1 = new Dog("Minesweeper", 4);
		Dog dog2 = new Dog("Solitaire", "card game");
		
		boolean dog1Barked = false;
		if(dog1.isSleeping()){
			System.out.println(dog1.getName() + " is sleeping soundly");
		} else {
			dog1Barked = true;
			dog1.bark();
		}
		
		if(dog1Barked && dog2.isSleeping()){
			System.out.println(dog2.getName() + " was rudely awoken");
			dog2.bark();
		} else if (dog1Barked && !dog2.isSleeping()){
			dog2.bark();
		}
		


	}
}
