package Daytwo;

public class NestedForLoop {

	public static void main(String[] args)
	{
		byte start =1;
		byte end=15;
		for(int i=start;i<=end;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(j +" x "+i+" = "+i*j);
			}
			System.out.println(" ");
		}
	}

}
