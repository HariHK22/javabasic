package DayFive;


	class Human{
		private int age;
		private String name;
		
		 public int getAge() {
				return age;
			}
			 
		 public String getName() {
				 return name;
		 }
		 
		 public void setName(String name) {
			 this.name=name;
		 }
		 
		 public  void setAge(int age) {
			 this.age=age;
		 }
			 
		

	}
	
	public class Encapsulastion {
	public static void main(String[] args) {
		Human obj =new Human();
		obj.setName("null");
		obj.setAge(15);
		System.out.println(obj.getName());
		System.out.print(obj.getAge());
		}

	}
