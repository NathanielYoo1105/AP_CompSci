import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int level1s = 0;
		int level2s = 0;
		int level3s = 0;
        for(int l = 0; l < passwords.length; l++){
            boolean level1 = false;
            boolean level2 = false;
            if(passwords[l].length() >=8){
                level1 = true;
                level1s++;
            }
            for(int k = 0; k < passwords[l].length()-1; k++){
                String letter = passwords[l].substring(k, k+1); 
                if(letter.equals("!") || letter.equals("@") || letter.equals("#") || letter.equals("$") || letter.equals("%") || letter.equals("^") || letter.equals("&") || letter.equals("*")){
                    level2 = true;
                    level2s++;
                }
            }
            if(level1 && level2){
                level3s++;
            }
        }
        System.out.println("There are " + level1s + " passwords with a strength level of 1");
        System.out.println("There are " + level2s + " passwords with a strength level of 2");
        System.out.println("There are " + level3s + " passwords with a strength level of 3");
	}
}
