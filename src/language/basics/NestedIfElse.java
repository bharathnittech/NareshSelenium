package language.basics;

public class NestedIfElse {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		if (x != y) {

			if (x > y) {
				System.out.println("X is greater than Y");
			} else {
				System.out.println("X is less than Y");
			}

		} else {
			System.out.println("X is equal to Y");
		}

	}

}
