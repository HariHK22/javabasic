package Daytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		char a='L';
		switch(a) {
		case 'L':
		case 'l':
			System.out.println(a+" It was an charcter");
			break;
		case 'S':
		case 's':
			System.out.println(a+" It was an Character");
			break;
		default:
			System.out.println(a+" It was not an charcter or an Space or an special charcter");
	}
	}

}
