/*Lab 27 BaseClass
 *	Author: Nathaniel Yoo
 *  Date: 10/14/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public String role;
	public int str;
	public int dex;
	public int chrm;
	public int intel;

	public BaseClass() {
		role = new String("No Role");
		str = 0;
		dex = 0;
		chrm = 0;
		intel = 0;
	}
	
	public BaseClass(String selectedRole){
		role = selectedRole;
	}
	
	public boolean setAll(String setRole, int setStr, int setDex, int setChrm, int setIntel){
		if(setStrength(setStr) >= 0 && setDexterity(setDex) >= 0 && setCharisma(setChrm) >= 0 && setIntelligence(setIntel) >= 0){
			if(setRole(setRole).equals("Warrior") || setRole(setRole).equals("Wizard") || setRole(setRole).equals("Rogue")){
				return true;
			}
		}
		return false;
	}
	
	public int setStrength(int setStr){
		if(setStr < 0){
			setStr = 0;
		}
		str = setStr;
		return str;
	}
	public int setDexterity(int setDex){
		if(setDex < 0){
			setDex = 0;
		}
		dex = setDex;
		return dex;
	}
	
	public int setCharisma(int setChrm){
		if(setChrm < 0){
			setChrm = 0;
		}
		chrm = setChrm;
		return chrm;
	}
	
	public int setIntelligence(int setIntel){
		if(setIntel < 0){
			setIntel = 0;
		}
		intel = setIntel;
		return intel;
	}
	
	public String setRole(String selectedRole){
		if(selectedRole.equals("Warrior") || selectedRole.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
			role = "Warrior";
			return role;
		} else if(selectedRole.equals("Rogue") || selectedRole.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			role = "Rogue";
			return role;
		} else if(selectedRole.equals("Wizard") || selectedRole.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
			role = "Wizard";
			return role;
		} else {
			System.out.println("You've decided not to chose a role. Rerun program.");
			role = "No Role";
			return role;
		}
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + str);
		System.out.println("Your dexterity trait is " + dex);
		System.out.println("Your intelligence trait is " + intel);
		System.out.println("Your charisma trait is " + chrm);
		return;
	}
	

}

