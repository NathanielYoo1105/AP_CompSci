/* Exercise 13
	Author: Nathaniel Yoo
	Date: 10/28/24
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman test = new Spiderman();
		test.setActor("Tobey Maguire");
		test.setAge(49);
		test.setVillain("Green Goblin");
		
		Spiderman two = new Spiderman("Andrew Garfield");
		two.setAge(41);
		two.setVillain("Electro");
		
		Spiderman three = new Spiderman("John Mulaney", 42);
		three.setVillain("Ducktor Doom");
		
		Spiderman four = new Spiderman("Tom Holland", 27, "The Vulture");
		
		System.out.println("The villain is " + three.getVillain());
		three.fight();
		two.printArt();
	}
}
