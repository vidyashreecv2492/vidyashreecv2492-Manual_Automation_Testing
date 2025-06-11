package MyPackage;

public class Palindrome {

	public static void main(String[] args) {
		int num = 1234321;
		int original = 1234321;
		int rev = 0;
		
		while (num >0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		
		if (original == rev) {
			System.out.println("Yes, It is a palindrome");
		}else {
			System.out.println("No, It is not a palindrome");
		}

	}

}
