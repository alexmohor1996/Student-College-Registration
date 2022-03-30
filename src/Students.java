
public class Students {

	String firstName;
	String surName;
	int age;
	String city;
	long cnp;
	String address;
	int phone;
	double grade;
	
	
	static String[] firstNames() {
		String[] studentFirstNames = {"Simionescu", "Popescu", "Gheorghe", "Stefan", "Tudorache", "Mihalache", "Bontea", "Georgescu", "Rotaru", "Manea"};
		return studentFirstNames;
	}
	
	static String[] surNames() {
		String[] studentSurNames = new String[Students.firstNames().length];
		return studentSurNames;
	}
	
	static int[] ages() {
		
		int[] studentAges = new int[Students.firstNames().length];
		return studentAges;
	}
	
	static String[] cities() {
		String[] studentCities = new String[Students.firstNames().length];
		return studentCities;
	}
	
	static long[] CNPs() {
		long[] studentsCNP = new long[Students.firstNames().length];
		return studentsCNP;
	}
	
	static String[] Address() {
		String[] studentsAddresses = new String[Students.firstNames().length];
		return studentsAddresses;
	}
	
	static long[] phones() {
		long[] studentsPhones = new long[Students.surNames().length];
		return studentsPhones;
	}
	
	static double[] grades() {
		double[] studentsGrades = new double[Students.surNames().length];
		return studentsGrades;
	}
	
}
