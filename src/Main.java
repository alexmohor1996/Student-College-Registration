import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please enter your First Name, Sur Name to see if you have been admitted");

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First Niyfuyfuyfuamwdwwe: ");
		String FirstName = scanner.nextLine();
		System.out.println("Sur Name: ");
		String SurName = scanner.nextLine();
		System.out.println(FirstName);
		System.out.println(Students.firstNames()[0]);
		System.out.println(SurName);
		System.out.println(Students.surNames()[0]);
		
		if (FirstName.equals(Students.firstNames()[0]) && SurName.equals(Students.surNames()[0])) {
//			System.out.println("Hello, "+Students.firstNames()[0]+" "+Students.surNames()[0]);
//			System.out.println("What was your school finishing grade?");
//			double grade = scanner.nextInt();
//			for (int i=0; i<Students.grades().length; i++) {
//				System.out.println(i);
		}
		
	}
	
}
