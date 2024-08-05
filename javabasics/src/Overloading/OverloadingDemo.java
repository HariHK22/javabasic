package Overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println("----------------------Constructor Overloading------------------------");
		
		Point p =new Point();
		System.out.println(p);
		
		Point p1 =new Point(0.2f);
		System.out.println(p1);
		
		Point p2 = new Point(0.52f,0.63f);
			System.out.println(p2);
		System.out.println("----------------------Method Overloading-----------------------------");
		
		System.out.println("The addition value of two integer "+MethodOverloading.Addition(55, 23));
		System.out.println("The addition value of two integer "+MethodOverloading.Addition(0.2f,0.2f));
		System.out.println("The addition value of two integer "+MethodOverloading.Addition(35, 5.4f));
		System.out.println("The addition value of two integer "+MethodOverloading.Addition(0.56f, 27));
		System.out.println("The addition value of two integer "+MethodOverloading.Addition("Hello", " Codeers"));
		
		

	}

}
