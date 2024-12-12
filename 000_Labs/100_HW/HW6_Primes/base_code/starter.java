/* Primes
 *	Author: Nathaniel Yoo
 *  Date: 10/8/2024
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int num){
		int condition = num;
		while(condition > 2){
			condition--;
			if(num % condition == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimes(int num){
		if(checkPrime(num))
			System.out.println(num);
		return;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int max = sc.nextInt();
		int check = 2;
		while (check <= max){
			printPrimes(check);
			check++;
		}
	}
}
