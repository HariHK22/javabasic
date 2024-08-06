package DaySix;
 abstract class Vehicles{
	 
	 abstract public void speed();
	 public void PlayMusic() {
		 System.out.println("Every vehicles have an Music player");
	 }
 }
 
 class Bike extends Vehicles{
	 public void speed() {
		 System.out.println("55km/hr");
	 }
 }
 
 class car extends Vehicles{
	 public void speed() {
		 System.out.println("25km/hr");
	 }
 }

public class Abstract {
	public static void main(String[] args) {
		Vehicles obj = new Bike();
		Vehicles obj1 = new car();
		System.out.println("------------It was an Bike---------");
		obj.speed();
		obj.PlayMusic();
		System.out.println("-------------It was an Car----------");
		obj1.speed();
		obj1.PlayMusic();
		
		
	}

}
