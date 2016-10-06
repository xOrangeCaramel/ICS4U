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

			
		} while(option != 10);
		
		input.close();
		System.out.println();
		System.out.println("Goodbye! :)");
	}
	
	public static void addStudent() throws InvalidInputException{
		
		System.out.println("Please enter the first name.");
		input.nextLine();
		String fName = input.nextLine();
		
		System.out.println("Please enter the last name.");
		String lName = input.nextLine();

		
		System.out.println("Please enter the street address.");
		String strAd = input.nextLine();

		
		System.out.println("Please enter the city.");
		String city = input.nextLine();

		
		System.out.println("Please enter the province.");
		String prov = input.nextLine();

		
		System.out.println("Please enter the postal code. (A1A 1A1).");
		String postCode = input.nextLine();

		
		System.out.println("Please enter the phone number.");
		String num = input.nextLine();
		
		System.out.println("Please enter the date of birth.");
		String bDate = input.nextLine();

		StudentInfo student = new StudentInfo(fName, lName, strAd, city, prov, postCode, num, bDate);
		System.out.println();

		studentRecs.add(student);
		
		System.out.println(lie.getMessage);
		
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

