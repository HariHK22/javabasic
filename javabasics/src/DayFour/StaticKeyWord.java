package DayFour;

public class StaticKeyWord {
	
	public static void main(String[] args)
	{
		
		Father.Print();
		System.out.println(Father.age);
		Daughter.age=15;
		System.out.println(Father.age);
		
	}

}
class Father{
	static char gender='M';
	static int age=50;
	static void Print() {
		System.out.println("This is an parent class");
	}
}

class Daughter extends Father{
	char gender='F';
	
	
}
