package language.basics;

public class NestedLoops {
	
	

	public static void main(String[] args) {

		int i, j;

		String[][] studentNames = { { "ABC", "XYZ", "CDF" }, { "Suresh", "Naresh", "Mahesh" } };

//		System.out.println(studentNames[0][0]);
//		System.out.println(studentNames[0][1]);
//		System.out.println(studentNames[0][2]);
//		System.out.println(studentNames[1][0]);
//		System.out.println(studentNames[1][1]);
//		System.out.println(studentNames[1][2]);

		for (i = 0; i < studentNames.length; i++) {

			for (j = 0; j < studentNames[0].length; j++) {
				System.out.println(studentNames[i][j]);
			}

		}

		System.out.println(i);
		


	}

}
