package language.basics;

public class ComparisinOperators {

	public static void main(String[] args) {

//		if(condition) {
//			
//		}else {
//			
//		}
//		
//		if(condition1) {
//			
//		}else if(condition2) {
//			
//		}else if(condition3) {
//			
//		}else {
//			
//		}

		int x = 10;
		int y = 20;

		if (x == y) {
			System.out.println("X and Y are Equal");
		} else {
			System.out.println("X and Y are not equal");
		}

		if (x == y) {
			System.out.println("X and Y are Equal");
		} else if (x < y) {
			System.out.println("X is greater than Y");
		} else if (x < y) {
			System.out.println("X is greater than Y");
		} else {
			System.out.println("X is less than Y");
		}

	}

}
