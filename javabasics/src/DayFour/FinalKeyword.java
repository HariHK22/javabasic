package DayFour;

//final - variable ,Method,Class

//for final Class
 /*final*/ class calc{
	
	//final Method 
	public  /*final*/ void show() {
		System.out.println("This was an calculator BY XXX");
	}
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
}

class AdvanceCalc extends calc{
	public void show() {
		System.out.println("It was an advance calculator BY YYY");
		System.out.println("It was an constrcutor class");
		System.out.println("It was an constrcutor class");
		System.out.println("It was an constrcutor class");
	}
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		//final variable
		final int a=10;
		System.out.println(a);
		
		calc obj =new calc();
		AdvanceCalc obj2 =new AdvanceCalc();
		obj2.show();
		
		

	}

}
