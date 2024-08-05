package Overloading;

public class MethodOverloading {
	
	public static int Addition(int a,int b) {
		return a+b;
	}

	public static float Addition(float a, float b) {
		return a+b;
	}
	
	public static float Addition(float a, int b)
	{
		return a+b;
	}
	
	public static float Addition(int a,float b) {
		return a+b;
	}
	
	public static String Addition(String a,String b) {
		return a+b;
	}
	
}
