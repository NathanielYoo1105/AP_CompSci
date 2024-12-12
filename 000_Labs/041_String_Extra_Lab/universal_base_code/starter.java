/* Lab 41
 *	Author: Nathaniel Yoo
 *  Date: 12/5/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = sc.nextLine();
		String backSent = new String("");
		while(true){
			if(sentence.indexOf(" ") == -1){
				backSent = sentence + " " + backSent;
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			backSent = word + " " + backSent;
			sentence = sentence.substring(space + 1);
		}
		System.out.println(backSent);


		
	}
}
