package DaySix;

abstract class A{
	abstract public void show();
}

public class AbstractAnonymousInner {
	public static void main(String[] args)
	{
		A obj =new A() {
			public void show() {
				System.out.println("It was an new show");
				
			}
		};
		obj.show();
	}

}
