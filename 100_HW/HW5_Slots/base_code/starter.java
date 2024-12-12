/* Slots
 *	Author: Nathaniel Yoo
 *  Date: 10/1/2024
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money");
		System.out.println("\n--------------------------------------------------\n");
		int money = 100;
		int wager = 0;
		while(money > 0){
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
			String play = sc.nextLine();
			if(play.equals("Yes") || play.equals("yes") || play.equals("Y") || play.equals("y")){
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				while(true){
					wager = sc.nextInt();
					sc.nextLine();
					
					if(wager > 0 && wager <= money){
						money = money - wager;
						break;
					}
					else if(wager > money){
						System.out.print("You only have $" + money + "! Please enter a smaller number : ");
					}
					else{
						System.out.print("Sneaky! No negatives or 0! Please enter a larger number : ");
					}
				}
				// SLOT MACHINE CODE HERE
				int num1 = (int)(Math.random() * 10 + 1);
				int num2 = (int)(Math.random() * 10 + 1);
				int num3 = (int)(Math.random() * 10 + 1);
				
				System.out.println("\nGreat! Let's play!!!");
				System.out.println("Your rolls are: ");
				System.out.println("_______________________");
				System.out.println(" | " + num1 + " | " + num2 + " | " + num3 +" | ");
				System.out.println("_______________________");
				
				if(num1 == num2 && num2 == num3){
					System.out.println("JACKPOT!!! Your wager has now been tripled!");
					money = money + (wager * 3);
				} else if(num1 == num2 || num2 == num3 || num1 == num3){
					System.out.println("You won! Your wager has now been doubled!");
					money = money + (wager * 2);
				} else {
					System.out.println("Didn't win this time, better luck next time!");
				}
				
				System.out.println("You now have $" + money);
				System.out.println("\n--------------------------------------------------\n");
				
			} 
			else if (play.equals("No") || play.equals("no") || play.equals("N") || play.equals("n")){
				System.out.println("Sad to see you go! You still have " + money + " left. Come again soon! Thanks!");
				break;
			} 
			else {
				System.out.println("That wasn't quite the correct answer. Try again.");
			}
		}
	}
}
