package DayThreeTaxCal;

public class Recursion {
	
	public static void main(String[] args) {
		natprint(10);
	}
	public static void natprint(int n) {
		
		if(n==1) {
			System.out.println(n);
		}
		else {
			System.out.println(n);
			natprint(n-1);
		}
		
		
	}

}
