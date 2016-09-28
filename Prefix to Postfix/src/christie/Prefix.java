package christie;

import java.util.*;

public class Prefix {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String msg = "Please enter an expression in prefix notation.";
		
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		String prefix = input.nextLine();
		
		System.out.println(postfix(prefix)[0]);
		input.close();
	}
	
	public static String[] postfix(String prefix){
		String[] result = {"", "", ""};
		if (prefix.length() == 1){
			result[0] = prefix;
			return result;
		}
		String[] recurse = postfix(prefix.substring(2));
		if (prefix.substring(0, 1).equals("-")|| prefix.substring(0,1).equals("+")){
			result[0] = recurse[0] + " " + recurse[1] + " " + prefix.substring(0, 1);
			result[1] = recurse[2];
			return result;
		}
		else {
			result[0] = prefix.substring(0,1);
			result[1] = recurse[0];
			result[2] = recurse[1];
			return result;
		}
	}
}