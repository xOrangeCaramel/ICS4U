/**
 * 
 */
package christie;

/**
 * @author 323022079
 *
 */
import java.util.Scanner;

public class NumDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		System.out.println("That integer contains " + numDigit(n/10) + " digit(s).");
	}
	
	public static int numDigit (int n) {
		if (n == 0){
			return 1;
		}
		else {
			return 1 + numDigit(n/10);
		}
	}
		

}

