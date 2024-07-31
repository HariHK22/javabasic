package DayThreeTaxCal;

public class AcessSpecifiers {
	int rollno;
	private String name;
	
	public void display() {
		System.out.println("Your name is :"+name);
		System.out.println("Your roll no is :"+rollno);
	
	}
	
	
	public void set(String str,int rollno) {
		this.name=str ;
		this.rollno=rollno;
	}
	
	
	public static void main(String[] args)
	{
		AcessSpecifiers me = new AcessSpecifiers();
		AcessSpecifiers you = new AcessSpecifiers();
		
		me.set("XXX",15);
		me.display();
		System.out.println("By using getter : "+me.rollno);
		System.out.println("");
		
		you.set("ZZZ", 99);
		you.display();
		System.out.println("By using getter : "+you.name);
	}
	

}
