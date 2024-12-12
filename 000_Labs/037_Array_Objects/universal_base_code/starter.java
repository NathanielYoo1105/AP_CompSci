/* Lab 37
 *	Author: Nathaniel Yoo 
 *  Date: 11/14/24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] warriorArmy = new Warrior[100];
		for(int i = 0; i < warriorArmy.length; i++){
			warriorArmy[i] = new Warrior();
		}
		
		Wizard[] wizardArmy = new Wizard[100];
		for(int i = 0; i < wizardArmy.length; i++){
			wizardArmy[i] = new Wizard();
		}
		
		int fightingWizard = wizardArmy.length-1;
		int fightingWarrior = warriorArmy.length-1;
		while(true){
			wizardArmy[fightingWizard].attack(warriorArmy[fightingWarrior]);
			if(fightingWarrior > 0){
				if(warriorArmy[fightingWarrior].isDead())
					fightingWarrior--;
			} else {
				System.out.println("Wizards won with " + fightingWizard + " left in their army");
				break;
			}
			
			warriorArmy[fightingWarrior].attack(wizardArmy[fightingWizard]);
			if(fightingWizard > 0){
				if(wizardArmy[fightingWizard].isDead())
					fightingWizard--;
			} else {
				System.out.println("Warriors won with " + fightingWarrior + " left in their army");
				break;
			}
		}
	}
}
