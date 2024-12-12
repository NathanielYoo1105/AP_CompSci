/* Lab 35
 *	Author:  Nathaniel Yoo
 *  Date: 11/5/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[(int)(Math.random()*149 + 51)];
		int max = 0;
		int min = 100;
		int avg = 0;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100 + 1);
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
			avg += arr[i];
		}
		avg = avg / arr.length;
		
		System.out.println("There are " + arr.length + " values in the array");
		System.out.println("The maximum value is " + max);
		System.out.println("The minimum value is " + min);
		System.out.println("The average value is " + avg);
	}
}
