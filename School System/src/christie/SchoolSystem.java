package christie;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem {
	public static ArrayList<StudentInfo> studentRecs = new ArrayList<StudentInfo>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[]args){
		int option = 0;
		
		do{

			System.out.println("Choose an option.");
			System.out.println("1. Enter a new student.");
			System.out.println("2. Print a student.");
			System.out.println("3. Print all students.");
			System.out.println("10. Quit.");
			
			option = input.nextInt();
			
			if (option == 1){
				addStudent();
			}
			else if (option == 2){
				System.out.println("Which student would you like to print?");
				int n = input.nextInt();
				printStudent(studentRecs.get(n));

			}
			else if (option == 3){
				printAll();
			}
			//else if (option == 4){
			//	System.out.println("Eneter the name first name of the student you would like to remove.");
			//	int n = input.nextInt();
			//}

			
		} while(option != 10);
		
		input.close();
		System.out.println();
		System.out.println("Goodbye! :)");
	}
	
	public static void addStudent(){

		StudentInfo student = new StudentInfo();
		
		System.out.println("Please enter the first name.");
		input.nextLine();
		String fName = input.nextLine();
		student.setFirstName(fName);
		
		System.out.println("Please enter the last name.");
		String lName = input.nextLine();
		student.setLastName(lName);
		
		System.out.println("Please enter the street address.");
		String strAd = input.nextLine();
		student.setStrAddress(strAd);
		
		System.out.println("Please enter the city.");
		String city = input.nextLine();
		student.setCity(city);
		
		System.out.println("Please enter the province.");
		String prov = input.nextLine();
		student.setProvince(prov);
		
		System.out.println("Please enter the postal code. (A1A 1A1).");
		String postCode = input.nextLine();
		student.setPostalCode(postCode);
		
		System.out.println("Please enter the phone number");
		String num = input.nextLine();
		if (num.length() == 7){
			String pnum= num.substring(0, 2) + "-" + num.substring(3, 5) + "-" + num.substring(6);
			student.setPhoneNum(pnum);
		}
		
		
		
		System.out.println("Please enter the date of birth.");
		String bDate = input.nextLine();
		student.setBirthDate(bDate);
		
		System.out.println();

		
		studentRecs.add(student);
		
	}
	public static String checkPhoneNum(String phoneNum){
		String num =  "\\d\\d\\d([,\\s])?\\d\\d\\d([,\\s])?\\d\\d\\d\\d";
		if (phoneNum.matches(num)){
			return phoneNum;
		}else{
			return "Please try again";
		}
	}

	public static void printStudent(StudentInfo student){
		
		System.out.println(student.getFirstName() + ", " + student.getLastName());
		System.out.println(student.getStrAddress() );
		System.out.println(student.getCity() + ", " + student.getProvince());
		System.out.println(student.getPostalCode());
		System.out.println(student.getPhoneNum());
		System.out.println(student.getBirthDate());
		System.out.println();

	}
	
	public static void printAll(){
		for (int i = 0; i< studentRecs.size(); i++){  	
			
			printStudent(studentRecs.get(i));
			
		
		}
	}
}
