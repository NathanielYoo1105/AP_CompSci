/* Pig Latin
   * Author: Nathaniel Yoo
   * Date: 12/5/24
   * Collaborator(s):
*/
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence to be translated into pig latin: ");
		String sent = sc.nextLine();
		String pigsent = new String("");
		while(true){
			if(sent.indexOf(" ") == -1){
				if((sent.substring(0,1).toLowerCase()).equals("a") || (sent.substring(0,1).toLowerCase()).equals("e") || (sent.substring(0,1).toLowerCase()).equals("i") || (sent.substring(0,1).toLowerCase()).equals("o") || (sent.substring(0,1).toLowerCase()).equals("u")){
				pigsent = pigsent + sent + "-way ";
			} else if(sent.length() <= 2){
				pigsent = pigsent + sent + "-ay ";
			} else if((sent.substring(1,2).toLowerCase()).equals("a") || (sent.substring(1,2).toLowerCase()).equals("e") || (sent.substring(1,2).toLowerCase()).equals("i") || (sent.substring(1,2).toLowerCase()).equals("o") || (sent.substring(1,2).toLowerCase()).equals("u")){
				pigsent = pigsent + sent.substring(1) + "-" + sent.substring(0,1) + "ay ";
			} else {
				pigsent = pigsent + sent.substring(2) + "-" + sent.substring(0,2) + "ay ";
			}
				break;
			}
			int space = sent.indexOf(" ");
			String word = sent.substring(0, space);
			if((word.substring(0,1).toLowerCase()).equals("a") || (word.substring(0,1).toLowerCase()).equals("e") || (word.substring(0,1).toLowerCase()).equals("i") || (word.substring(0,1).toLowerCase()).equals("o") || (word.substring(0,1).toLowerCase()).equals("u")){
				pigsent = pigsent + word + "-way ";
			} else if(word.length() <= 2){
				pigsent = pigsent + word + "-ay ";
			} else if((word.substring(1,2).toLowerCase()).equals("a") || (word.substring(1,2).toLowerCase()).equals("e") || (word.substring(1,2).toLowerCase()).equals("i") || (word.substring(1,2).toLowerCase()).equals("o") || (word.substring(1,2).toLowerCase()).equals("u")){
				pigsent = pigsent + word.substring(1) + "-" + word.substring(0,1) + "ay ";
			} else {
				pigsent = pigsent + word.substring(2) + "-" + word.substring(0,2) + "ay ";
			}
			
			sent = sent.substring(space + 1);
		}
		System.out.println(pigsent);
		
	}
}
