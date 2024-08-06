package DaySix;

class C{
	int rs=55;
	public void show() {
		System.out.println("It was an Show From class A");
	}
	//static 
	 class B{
		// static 
		 public void config() {
			System.out.println("It was an Config class");
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		C obj = new C();
		obj.show();
		C.B obj1 = obj.new B();
		obj1.config();
		
		//when class B is static 
		//A.B obj1 =new A.B();
		
		//when config was an static 
	   // A.B.config();
	}
	

}
