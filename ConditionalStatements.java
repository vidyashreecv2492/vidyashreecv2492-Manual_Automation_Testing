package MyPackage;

public class ConditionalStatements {

	public static void main(String[] args) {
		int math = 34;
		int science = 87;
		int english = 96;
		
		int avg = (math + science + english) / 3;
		
		System.out.println("Average of three subjects: " + avg);
		
		if(avg >= 90) {
			System.out.println("Grade: A+");
			System.out.println("Excellent performance");
		}
		else if(avg >= 75) {
			System.out.println("Grade: A");
			System.out.println("Excellent performance");
		}
		else if(avg >= 60) {
			System.out.println("Grade: B");
			System.out.println("Keep improving");
		}
		else if(avg >= 40) {
			System.out.println("Grade: C");
			System.out.println("keep improving");
		}
		else {
			System.out.println("Grade: Fail");
			System.out.println("Please work harder next time");
		}
		
		// To check if any subject is below 35
		
		if (math <35 || science < 35 || english < 35) {
			System.out.println("Failed due to low score in at least one subject");
		}
	}

}
