package DayFour;

public class Multilevel {
	static class A{
		int one=1;
	}
	static class B extends A{
		int two=2;
	}
	static class C extends B {
		int three=3;
	}

	public static void main(String[] args) {
		
		C c1 =new C();
		System.out.println(c1.two);
		

		
	}

}
