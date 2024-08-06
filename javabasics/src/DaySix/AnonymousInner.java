package DaySix;
class A {
	public void show() {
		System.out.println("It Was A show");
	}
}

public class AnonymousInner {
	public static void main(String[] args) {
		A obj = new A() 
		{
			@Override
			public void show() {
				System.out.println("It Was new show");
			}
		};
		obj.show();
		
	}

}
