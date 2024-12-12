/* Lab 34
 *	Author:  Nathaniel Yoo
 *  Date: 11/5/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] randNums = new int[1000];
		for(int i = 0; i < randNums.length; i++){
			randNums[i] = (int)(Math.random() * 1000);
		}
		for(int i = 0; i < randNums.length; i++){
			System.out.println(randNums[i]);
		}
		
	}
}
