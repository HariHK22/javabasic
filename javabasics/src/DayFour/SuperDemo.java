package DayFour;

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
}

class Employee extends Person{
	Employee(String name){
		super(name);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		
		Employee e=new Employee("Sowmiya");
		System.out.println(e.name);
	}

}
