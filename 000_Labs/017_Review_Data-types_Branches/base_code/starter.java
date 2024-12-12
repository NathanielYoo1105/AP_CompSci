/* Lab 17
 *	Author:  Nathaniel Yoo
 *  Date: 9/19/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Character Name
		System.out.print("Enter your character's name: ");
		String name = sc.nextLine();
		
		//Character Title
		System.out.print("Enter your character's title (ex. Dragon Slayer): ");
		String title = sc.nextLine();
		
		//Role
		System.out.println("Would you like to be a Wizard, Warrior or Rogue?");
		String role = sc.nextLine();
		if (role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You are a Wizard");
		} else if (role.equals("Warrior") || role.equals("warrior")){
			System.out.println("You are a Warrior");
		} else if (role.equals("Rogue") || role.equals("rogue")){
			System.out.println("You are a Rogue");
		} else{
			System.out.println("You didn't choose a valid role");
			System.out.println("You are a peasant");
			role = "Peasant";
		}
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		int sp = 20;
		System.out.print("Strength (1-10): ");
		int str = sc.nextInt();
		if (str > 10){
			System.out.println("Please input a smaller value.");
			System.out.print("Strength (1-10): ");
			str = sc.nextInt();
		}
		sp = sp - str;
		System.out.println("You have " + sp + " skill points");
		
		System.out.print("Dexterity (1-10): ");
		int dex = sc.nextInt();
		if (dex > sp){
			System.out.println("You don't have enough skill points!");
			System.out.println("Please input a smaller value.");
			System.out.print("Dexterity (1-10): ");
			dex = sc.nextInt();
		}
		sp = sp - dex;
		System.out.println("You have " + sp + " skill points");
		
		System.out.print("Intelligence (1-10): ");
		int intel = sc.nextInt();
		if (intel > sp){
			System.out.println("You don't have enough skill points!");
			System.out.println("Please input a smaller value.");
			System.out.print("Intelligence (1-10): ");
			intel = sc.nextInt();
		}
		sp = sp - intel;
		System.out.println("You have " + sp + " skill points");
		
		System.out.print("Charisma (1-10): ");
		int chrm = sc.nextInt();
		if (chrm > sp){
			System.out.println("You don't have enough skill points!");
			System.out.println("Please input a smaller value.");
			System.out.print("Charisma (1-10): ");
			chrm = sc.nextInt();
		}
		sp = sp - chrm;
		
		System.out.println("You are " + name + " the " + title);
		System.out.println("You are a " + role + " with the following stats");
		System.out.println("Strength: " + str);
		System.out.println("Dexterity: " + dex);
		System.out.println("Intelligence: " + intel);
		System.out.println("Charisma: " + chrm);
	}
}
