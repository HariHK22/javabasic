package DayFour;

public class Hierarchical {
	
	static class Animal{
		void Eat() {
			System.out.println("Animal eats");
		}
	}
	
	static class dog extends Animal{
		void Bark() {
			System.out.println("Dog was Bark");
		}
	}
	
	static class Puppy extends dog{
		void Weep() {
			System.out.println("Puppy Weeps");
		}
	
	static class Cat extends Animal {
		void Meow() {
			System.out.println("Cat meowwww..");
		}
	}
	}
	
	
	

	public static void main(String[] args) {
		
		Puppy obj =new Puppy();
		obj.Weep();
		

	}

}
