package language.basics;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int userAge = 65;
		
		if(userAge>=60 ||  userAge<=5) {
			System.out.println("User is Eligible to get window seat");
		}else {
			System.out.println("Not eligible");
		}
		
		
		boolean hasPanCard = true;		
		boolean hasSalary = true;
		int creditScore = 600;
		
		if (hasPanCard && (hasSalary || creditScore>=750)) {
			System.out.println("Credit card should be generated");
		}else {
			System.out.println("Not Eligible");
		}
		
		
		int age = 17 ;
		
		if (!(age <18)  ) {
			System.out.println("Eligible for Vote");
		}else {
			System.out.println("Not eligible to Vote");
		}
		

	}

}
