package language.basics;

public class Methods {

	public static void main(String[] args) {

		String Student1Fname = "Mr";
		String Student1LastName = "Naresh";

		String Student2Fname = "Mrs";
		String Student2LastName = "ABC";

		String Student3Fname = "Ms";
		String Student3LastName = "XYZ";

//		System.out.println(Student1Fname);
//		System.out.println(Student1LastName);
//		System.out.println("=========================");
//
//		System.out.println(Student2Fname);
//		System.out.println(Student2LastName);
//		System.out.println("=========================");
//
//		System.out.println(Student3Fname);
//		System.out.println(Student3LastName);
//		System.out.println("=========================");
		
		new Methods().printFirstNameAndLastName(Student1Fname, Student1LastName);
		new Methods().printFirstNameAndLastName(Student2Fname, Student3LastName);
		new Methods().printFirstNameAndLastName(Student3Fname, Student3LastName);
		
		System.out.println(new Methods().getFullName(Student1Fname, Student1LastName));
		
	}

	void printFirstNameAndLastName(String firstname , String lastname){
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println("-------------------------------");
	}
	
	String getFullName(String firstname , String lastname){
		return firstname+" "+lastname;
	}


}
