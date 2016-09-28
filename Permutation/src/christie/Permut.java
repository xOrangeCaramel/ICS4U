package christie;

import java.util.Scanner;

public class Permut {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n < 0) {
			System.out.println("Please enter a number.");
			n = input.nextInt();
		}
		int r = input.nextInt();
		while (r < 0) {
			System.out.println("Please enter a number.");
			r = input.nextInt();
		}
		input.close();
		System.out.print(permut(r, n));
	}
	
	public static int permut(int r, int n){
		return factorial(n)/factorial(n-r);
		
	}
	public static int factorial(int n){
		if (n == 1){
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
}
