/* Sponge Case
	Author: Nathaniel Yoo
	Date: 12/5/24
*/
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to be converted into sPoNgE cAsE: ");
		String sentence = sc.nextLine();
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(spongeCase(sentence) + " ");
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(spongeCase(word) + " ");
			
			sentence = sentence.substring(space + 1);
		}

	}
	public static String spongeCase(String word){
		String lower = word.toLowerCase();
		String upper = word.toUpperCase();
		String spongeWord = new String("");
		for(int i = 0; i < word.length() - 1; i++){
			if(i % 2 == 0){
				spongeWord = spongeWord + lower.substring(i, i+1);
			} else {
				spongeWord = spongeWord + upper.substring(i, i+1);
			}
		}
		if(word.length() % 2 != 0){
				spongeWord = spongeWord + lower.substring(word.length() - 1);
			} else {
				spongeWord = spongeWord + upper.substring(word.length() - 1);
			}
		return spongeWord;
		
	}
}
