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
		int power = input.nextInt();
		input.close();
		
		System.out.println(stars(Math.pow(2, power)));
	}
	
	public static int stars(double power){
		int result;
		if (power == 0) {
			return 1;
		}
		else { 
			return ;
		}
	}
}
