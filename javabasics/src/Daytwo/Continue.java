package Daytwo;

public class Continue {

	public static  void main(String[] args)
	{
		for(int k=3;k<16;k++)
		{
			if(k%2!=0)
			{
				continue;
			}
			System.out.println("The even no. are :"+k);
		}
	}

}
