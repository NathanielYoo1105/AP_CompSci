/*Lab 26
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
		
		test.myToString();
		
		System.out.println("------------------------------------------------");
		
		System.out.println("What class would you like to be?");
		String x = sc.nextLine();
		
		BaseClass test2 = new BaseClass(x);
		test.myToString();


		
	}
}
