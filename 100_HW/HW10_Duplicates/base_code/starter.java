/* HW 10
 *	Author: Nathaniel Yoo
 *  Date: 11/7/2024
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 9 + 1);
		}
		
		int target = (int)(Math.random() * 9 + 1);
		System.out.println(target + " is the target number");
		int dupes = 0;
		
		for(int l = 0; l < arr.length; l++){
			if(target == arr[l]){
				dupes++;
				System.out.println("Index " + l + " is a duplicate");
			}
		}
		System.out.println("There were " + dupes + " duplicates of the target number");
		
		for(int e = 0; e < arr.length; e++){
			if(e < arr.length - 1){
				if(arr[e] == arr[e+1]){
					System.out.println("Index " + e + " and index " + (e+1) + " are consecutive and equal to " + arr[e]);
				}
			}
		}
		
	}
}
