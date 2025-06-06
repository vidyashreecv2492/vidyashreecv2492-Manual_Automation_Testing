package MyPackage;

public class Subjects {

	public static void main(String[] args) {
		int math = 97;
		int science = 95;
		int english = 98;
		
//		int total =  math + science + english;  //290
//		int avg = total / 3;                    //96
		
//		float total = math + science + english; //290.0
//		float avg = total / 3;                  //96.666664
//		
		float total = math + science + english; //290.0
		double avg = total / 3;                 //96.66666412353516  
		
//		double total = math + science + english; //290.0
//		double avg = total / 3;                 //96.66666666666667
	
//		long total = math + science + english; //290
//		long avg = total / 3;                  //96
				
		System.out.println("Total Marks is "+ total);
		System.out.println("Average of three subjects is "+ avg);		
		
//		// Logical Operators
//		System.out.println("1.AND operator: "+ ((total > 100) && (avg < 100)));
//		System.out.println("2.AND operator: "+ ((total > 100) && (avg < 90)));
//		System.out.println("3.OR operator: "+ ((total > 100) || (avg < 100)));
//		System.out.println("4.NOT operator: "+ (!(total>avg)));
//		
//		// Comparison Operators
//		System.out.println("1.Equal to: " + (total==avg));
//		System.out.println("2.Not Equal to: " + (total!=avg));
//		System.out.println("3.Greater than: " + (total>avg));
//		System.out.println("4.Less than: " + (total<avg));
//		System.out.println("5.Greater or Equal: "+(total>=avg));
//		System.out.println("6.Less or Equal: "+ (total<=avg));

	}

}
