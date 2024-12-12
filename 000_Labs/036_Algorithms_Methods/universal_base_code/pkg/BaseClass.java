/*
 *	Author:  Nathaniel Yoo
 *  Date: 11/14/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int [] array;

	public BaseClass(int[] x) {
		array = x;
		
	}
	
	public void toStringArray(){
		for(int i = 0; i < array.length; i++){
			System.out.println("Index " + i + " has a value of " +array[i]);
		}
	}
	
	public int getArrayAverage(){
		int temp = 0;
		for(int i = 0; i < array.length; i++){
			temp += array[i];
		}
		return temp / array.length;
	}
	
	public int getArrayMax(){
		int max = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] > max)
				max = array[i];
		}
		return max;
	}
	
	public int getArrayMin(){
		int min = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}

}

