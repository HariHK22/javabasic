package DayThreeTaxCal;

public class ClassObject {
	public int rollno;
	public String name;
	public  void display() {
		System.out.println("Name is :"+ name);
		System.out.println(name+" roll number is :"+rollno);
		
	}
	public void setvalue(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}

	public static void main(String[] args) {
		ClassObject me = new ClassObject();
		me.setvalue("Harikrishnan", 50);
		me.display();
		System.out.println(" ");
		
		ClassObject viewers =new ClassObject();
		viewers.setvalue("Abinaya", 10);
		viewers.display();
		
	}

}
