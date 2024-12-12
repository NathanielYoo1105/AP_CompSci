/*
 *	Author: Nathaniel Yoo
 *  Date: 9/16/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What day is it? (0 = Sunday, 1 = Mon, 2 = Tue, 3 = Wed, etc...): ");
		int day = sc.nextInt();
		
		if (day >= 1 && day <= 5){
			System.out.println("It's a weekday!\nWake up at 7:00");
		} else if (day == 0 || day == 6){
			System.out.println("It's the weekend!\nWake up at 10:00");
		}
	}
}
