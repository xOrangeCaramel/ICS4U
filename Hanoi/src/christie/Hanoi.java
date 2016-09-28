package christie;

import java.util.Scanner;
import java.util.ArrayList;

public class Hanoi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int n = input.nextInt();
		while (n < 0) {
			System.out.println("Please enter a number.");
			n = input.nextInt();
		}
		input.close();
		ArrayList<Integer> src = new ArrayList<Integer>();
		ArrayList<Integer> aux = new ArrayList<Integer>();
		ArrayList<Integer> dst = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++){
			src.add(0, i);
		}
		System.out.println("Peg A " + src);
		System.out.println("Peg B " + aux);
		System.out.println("Peg C " + dst);
		
		System.out.println("");
		
		System.out.println(solve(n, src, aux, dst) + " moves");
		System.out.println("Peg A " + src);
		System.out.println("Peg B " + aux);
		System.out.println("Peg C " + dst);
		
		
	}
	public static int solve(int n, ArrayList<Integer> src, ArrayList<Integer> aux, ArrayList<Integer> dst) {
		if (n == 0){
			return 0;
		}else{
			int moves = solve(n-1, src, dst, aux);
			moves++;
			int disk = (int) src.remove(0);
			dst.add(0, disk);
			moves += solve(n-1, aux, src, dst);
			return moves;
		}
	}
}