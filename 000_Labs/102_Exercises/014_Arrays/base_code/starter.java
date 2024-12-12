/* Arrays exercise
 *	Author: Nathaniel Yoo
 *  Date: 11/5/2024
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int i = 0;
		 while(i < 1001){
		 	arr[i] = i * 3 + 3;
		 	if(i < 15 || i == 1000){
		 		System.out.println(arr[i]);
		 	}
		 	i++;
		 }
		 
		 int [] arr2 = new int[1001];
		 int i2 = 0;
		 while(i2 < 1001){
		 	arr2[i2] = 1000 - i2;
		 	if(i2 < 15 || i2 == 1000){
		 		System.out.println(arr2[i2]);
		 	}
		 	i2++;
		 }
	}
}
