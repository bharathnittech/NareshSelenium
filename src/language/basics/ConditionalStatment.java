package language.basics;

public class ConditionalStatment {

	public static void main(String[] args) {

		int x = 5;

		switch (x) {
		case 1:
			System.out.println("EAST");
			break;
		case 2:
			System.out.println("WEST");
			break;
		case 3:
			System.out.println("SOUTH");
			break;
		case 4:
			System.out.println("NORTH");
			break;
		default:
			System.out.println("Invalid Direction");
		}

		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("FIRST CLASS");
			break;
		case 'B':
			System.out.println("SECOND CLASS");
			break;
		case 'C':
			System.out.println("THIRD CLASS");
			break;
		default:
			System.out.println("FAILED");
		}

		String priority = "high";
		switch (priority) {
		case "high":
			System.out.println("Immediatly dev should fix");
			break;
		case "medium":
			System.out.println("With in 2 hrs dev should fix");
			break;
		case "low":
			System.out.println("With in 8 hrs dev should fix");
			break;
		default:
			System.out.println("Invalid Priority");
		}

	}

}
