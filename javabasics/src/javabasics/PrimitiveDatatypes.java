package javabasics;

public class PrimitiveDatatypes {

	public static void main (String[] args){
		
		byte minbyte=127;
		byte maxbyte=-128;
		
		short minshort=32767;
		short maxshort=-32768;
		
		int minint=2147483647;
		int maxint=-2147483648;
		
		long minlong =9223372036854775807L;
		long maxlong = -9223372036854775808L;
		
		boolean flag =false;
		System.out.println("the minimum value for byte is "+minbyte+" the maximum value of byte is "+maxbyte);
		System.out.println("the minimum value for Short is "+minshort+" the maximum value of Short is "+maxshort);
		System.out.println("the minimum value for Integer is "+minint+" the maximum value of Integer is "+maxint);
		System.out.println("the minimum value for Long is "+minlong+" the maximum value of Long is "+maxlong);
		System.out.print("The boolean value is :"+flag);
		
	}

}
