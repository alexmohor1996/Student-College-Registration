import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello, welcome to the Harvard College Graduation");
		System.out.println("What would you like to do?");
		System.out.println("1. Admitted students list\n2. Check admit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			for (int i=0; i<Students.firstNames().length; i++) {
				
				Arrays.sort(Students.grades());
				System.out.println(Students.firstNames()[i]+ " "+Students.surNames()[i] +" - "+Students.grades()[i]);
			}
		}
		else if (choice == 2) {
			System.out.println("Please enter your First Name, Sur Name to see if you have been admitted");


			Scanner scanner1 = new Scanner(System.in);
			System.out.println("First Name: ");
			String FirstName = scanner1.nextLine();
			System.out.println("Sur Name: ");
			String SurName = scanner1.nextLine();
			
			for (int i=0; i<Students.firstNames().length; i++) {
				for (int j=0; j<Students.surNames().length; j++) {
					if (FirstName.equals(Students.firstNames()[i]) && SurName.equals(Students.surNames()[j])) {
						System.out.println("Hello, "+Students.firstNames()[i]+" "+Students.surNames()[j]);
						System.out.println("What was your school finishing grade?");
						double grade = scanner.nextDouble();
						if (grade < 9) {
							System.out.println("I'm sorry, you were not admitted");
						}
						else if (grade == 9) {
							System.out.println("You have been barely admitted");
						}
						else {
							System.out.println("Congratulations, you have entered the college");
						}
					}
				}
			}
		}
	}
}
