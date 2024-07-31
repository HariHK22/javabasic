package DayThreeTaxCal;
import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Employee e1 =new Employee();
		Employee e2 =new Employee();
		Employee e3 =new Employee();
		
		e1.setEname("Harikrishnan");
		System.out.println("The Employee name is : "+e1.getEname());
		
		e1.setEid(25);
		System.out.println(" the E-ID : "+e1.getEid());
		
		e1.setCity("Karaikal");
		System.out.println("the Employee City : "+e1.getCity());
		
		System.out.println(e1);
		System.out.println("");
		
		
		
		e2.setEname("Ragul");
		System.out.println("The Employee name is : "+e2.getEname());
		
		e2.setEid(26);
		System.out.println(" the E-ID : "+e2.getEid());
		
		e2.setCity("Chidambaram");
		System.out.println("the Employee City : "+e2.getCity());
		
		System.out.println(e2);
		System.out.println(" ");
		
		
		
		
		e3.setEname("Preethi");
		System.out.println("The Employee name is : "+e3.getEname());
		
		e3.setEid(27);
		System.out.println(" the E-ID : "+e3.getEid());
		
		e3.setCity("Chennai");
		System.out.println("the Employee City : "+e3.getCity());
		
		System.out.println(e3);
		System.out.println(" ");
		
		
		
		
		
		
		
	}

}
