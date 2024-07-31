package DayThreeTaxCal;

public class Employee {

	private String ename;
	private int eid;
	private String city;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", city=" + city + "]";
		
	}
	
	
	
	
	
}
