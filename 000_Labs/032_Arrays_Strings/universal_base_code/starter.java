/* Lab 32
 *	Author:  Nathaniel Yoo
 *  Date: 11/5/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String [] rick = new String[10];
		rick[0] = "We're no strangers to love";
		rick[1] = "You know the rules and so do I";
		rick[2] = "A full commitment's what I'm thinkin' of";
		rick[3] = "You wouldn't get this from any other guy";
		rick[4] = "I just wanna tell you how I'm feeling";
		rick[5] = "Gotta make you understand";
		rick[6] = "Never gonna give you up";
		rick[7] = "Never gonna let you down";
		rick[8] = "Never gonna run around and desert you";
		rick[9] = "Never gonna make you cry";
		
		for(int i = 0; i < rick.length; i++){
			System.out.println(rick[i]);
		}
	}
}
