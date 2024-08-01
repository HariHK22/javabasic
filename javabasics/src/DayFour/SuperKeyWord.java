package DayFour;

	 class Animal{
		 
		int age=21;
		Animal(String name){
			System.out.println(name);
		}
		void makesound() {
			System.out.println("Animal sound ");
		}
		
	}
	
	
	 class Dog extends Animal{
		Dog(){
			super("monkey");
			super.makesound(); 
			System.out.println("Dog");
			System.out.println(super.age);
		}
		
	}
	
	public class SuperKeyWord {
		public static void main(String[] args) {
			Dog d =new Dog();
			
		}

}
