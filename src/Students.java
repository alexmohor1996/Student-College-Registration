
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
		String[] studentSurNames = {"George", "Marius", "Alexandru", "Andrei", "Alexandra", "Andreea", "Corina", "Madalina", "Maria", "Cristiana"};
		return studentSurNames;
	}
	
	static int[] ages() {
		
		int[] studentAges = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
		return studentAges;
	}
	
	static String[] cities() {
		String[] studentCities = {"Arad", "Bucuresti", "Craiova", "Calarasi", "Deva", "Targu Jiu", "Hunedoara", "Suceava", "Bacau", "Sibiu"};
		return studentCities;
	}
	
	static long[] CNPs() {
		long[] studentsCNP = {1960313450024L, 1961253450024L, 1960313250024L, 1960664233024L, 1962323450024L, 1960313450024L, 1936335232224L, 1960363350024L, 1935135450024L, 1946444523224L};
		return studentsCNP;
	}
	
	static String[] Address() {
		String[] studentsAddresses = {"Gura Vadului", "Strada Humorului", "Aleea Tornadei", "Strada Burnitei", "Strada Postasului", "Aleea Tarnavei", "Gura Diham", "Gura Leului", "Strada Negru Voda", "Strada Potasiului"};
		return studentsAddresses;
	}
	
	static long[] phones() {
		long[] studentsPhones = {95398349342L, 83539494981L, 70501341221L, 83983993992L, 83583493948L, 93859139419L, 89199349849L, 83983984939L, 39893899349L, 89135981894L};
		return studentsPhones;
	}
	
	static double[] grades() {
		double[] studentsGrades = {7.35, 8.34, 9.25, 10.00, 9.62, 8.69, 9.25, 7.69, 6.82, 8.90};
		return studentsGrades;
	}
	
}
