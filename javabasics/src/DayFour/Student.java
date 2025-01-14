package DayFour;

public class Student {
	
	
	//non parameterized constructor
	public Student() {
		this.sid=100;
		this.sname="Hari";
		this.course="IoT";
		//System.out.println("Default constructor called ");
	}
	
	
	//Paramitrized
	public Student(int sid, String sname, String course) {
	
		this();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}



	private int sid;
	private String sname;
	private String course;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}

}
