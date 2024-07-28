package Daytwo;

public class Nestedifelse {

	public static void main (String[] args) {
		byte a=25;
		byte b=96;
		byte c=97;
		if(a>b) {
			if(a>c)
				System.out.println("A is largest ");
			else
				System.out.println("C is largest ");
		}
		
		{
			if (c>b)
			{
				System.out.println("C is laregst ");
			}
			else
				System.out.println("b is larhest ");
		}
	}

}
