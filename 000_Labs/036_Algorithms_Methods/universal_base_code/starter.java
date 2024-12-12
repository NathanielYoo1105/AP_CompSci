/* Lab 36
 *	Author: Nathaniel Yoo 
 *  Date: 11/14/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100 + 1);
		}
		BaseClass test = new BaseClass(arr);
		test.toStringArray();
		System.out.println("The average value of the array is " + test.getArrayAverage());
		System.out.println("The maximum value of the array is " + test.getArrayMax());
		System.out.println("The minimum value of the array is " + test.getArrayMin());
	}
}
