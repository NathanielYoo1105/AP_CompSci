/*Lab 22
 *	Author:  Nathaniel Yoo
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int c = a;
		while(b > 1){
			c = c * a;
			b = b - 1;
		}
		return c;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your base number: ");
		int x = sc.nextInt();
		System.out.print("Enter you exponent: ");
		int y = sc.nextInt();
		System.out.println(pow(x,y));
	}
}
