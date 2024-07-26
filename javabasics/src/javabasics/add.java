package javabasics;
import java.util.Scanner;

public class add {

	public static void main (String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the number 1 :");
		int a= scan.nextInt();
		System.out.print("Enter the number 2 : ");
		int b= scan.nextInt();
		int c=a+b;
		scan.nextLine();
		System.out.println("Enter your name : ");
		String name = scan.nextLine();
		System.out.println("And your total values : "+c);
		System.out.println("And your name is : "+name);
		
	}

}
