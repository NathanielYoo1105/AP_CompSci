/* Lab 27
 *	Author: Nathaniel Yoo 
 *  Date: 10/14/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BaseClass initial = new BaseClass();
		initial.myToString();
		
		System.out.println("------------------------------------------------");
		
		System.out.println("What class would you like to be?");
		String role = sc.nextLine();
		
		BaseClass actual = new BaseClass(role);
		if(actual.setAll(role, 5, 5, 5, 5)){
			actual.myToString();
		}
		
	}
}
