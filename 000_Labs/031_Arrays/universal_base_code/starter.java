/* Lab 31
 *	Author: Nathaniel Yoo 
 *  Date: 10/28/24t
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr.length - (i + 1);
			System.out.println("Index " + i + " has " + arr[i]);
		}
	}
}
