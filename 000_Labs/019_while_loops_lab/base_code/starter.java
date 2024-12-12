/* Lab 19
 *	Author:  Nathaniel Yoo
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		System.out.print("Enter the number of times you would like it to be printed: ");
		int count = sc.nextInt();
		
		while (count > 0){
			System.out.println(name);
			count = count - 1;
		}
		



		
	}
}
