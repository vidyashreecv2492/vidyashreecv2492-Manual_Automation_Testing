package MyPackage;

public class Vowels {

	public static void main(String[] args) {
		String str = "Hello how are you doing today?";
		String vowels = "aeiou";
		int count = 0;
		
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(vowels.indexOf(ch) != -1) {
				count++;
			}
		}
		
		System.out.println("Total Number of Vowels: " +count);
	}

}
