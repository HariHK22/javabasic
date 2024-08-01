package DayFour;

public class Zoo {
	
	static class Animal{
		
		String name;
		int age;
		
		void makeSound()
		{
			System.out.println("Animal Makes sounds ");
		}
	}
	
	static class Dog extends Animal{
		String breed;
		@Override
		void makeSound() {
			System.out.println("WoWW WoWW");
		}
		void fetch()
		{
			System.out.println("Dog is Fetching");
		}
		
	}
	
	static class Cat extends Animal{
		
		String colour;
		
		void Climb() {
			System.out.println("Cat can Climb");
		}
		@Override
		void makeSound() {
			System.out.println("Meow Meow");
		}
		
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.name="Alan";
		d.age=5;
	    d.breed="Lab";
	    System.out.println(d.name);
	    System.out.println(d.age);
	    System.out.println(d.breed);
		d.fetch();
		d.makeSound();
		
	}
	

}
