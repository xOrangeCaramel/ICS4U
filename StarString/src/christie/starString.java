/**
 * 
 */
package christie;

import java.util.Scanner;

/**
 * @author 323022079
 *
 */
public class starString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n < 0) {
			System.out.println("Please enter a positive number.");
			n = input.nextInt();
		}
		input.close();
		
		n = (int) Math.pow(2, n);
		
		starStrings(n);
	}
	
	public static void starStrings(int n){
		if (n == 0) {
			System.out.println("*");
		}
		else { 
			starStrings(n-1);
			for (i = 0, i < Math.pow(2,n), i++ ) {
				
				System.out.print("*");
			}
		}
	}
}
