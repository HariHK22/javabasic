package DayFour;

public class StudentName {
	public static void main(String[] args)
	{
		//Invoking Default constructor
		Student s1=new Student();
		System.out.println(s1);
		
		//Invoking parameterized
		Student s2 = new Student(102,"HariHK","JAVA FULLSTACK");
		System.out.println(s2);
	}

}
