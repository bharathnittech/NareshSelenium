package language.basics;

public class NonPriitiveDataTypes {

	public static void main(String[] args) {

		String studentname1 = "Abc";
		String studentname2 = "Akhil";
		String studentname3 = "Anitha";

		int rollnumber1 = 1;
		int rollnumber2 = 2;
		int rollnumber3 = 3;

		// Array (if we know all the values before creating the array)
		String[] studentNames = { "Abc", "Akhil", "Anitha" };
		int[] rollNumbers = { 1, 2, 3 };

		System.out.println(studentname2);
		System.out.println(studentNames[1]);

		// Array (if we don't have all the values while creating the array)
		String[] students = new String[3];
		students[0] = "Abc";
		students[1] = "Akhil";
		students[2] = "Anitha";
		
		String [][] studentGroup = { { "Abc", "Akhil", "Anitha" }, { "Abc", "Akhil", "Anitha" }};
	}

}
