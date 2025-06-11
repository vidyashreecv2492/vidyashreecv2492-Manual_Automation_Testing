package MyPackage;

public class SumOfDigits {

	public static void main(String[] args) {
		int digit = 1234;
		int sum = 0;
		
		while (digit != 0) {
	 		int lastDigit = digit % 10; //extract last digit
			sum = sum + lastDigit; // add to sum
			digit = digit / 10; // Remove last digit
			
		}
		System.out.print("Sum of digits: " + sum);
	}

}
