package korets_ua;

import java.util.Collections;

public class Application {
	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4l;
		float e = 5.5f;
		double f = 6.6;
		
		System.out.println("Max Byte: " + Byte.MAX_VALUE);
		System.out.println("Min Byte: " + Byte.MIN_VALUE);
	
		System.out.println("Max Short: " + Short.MAX_VALUE);
		System.out.println("Min Short: " + Short.MIN_VALUE);
		
		System.out.println("Max Integer: " + Integer.MAX_VALUE);
		System.out.println("Min Integer: " + Integer.MIN_VALUE);
		
		System.out.println("Max Long: " + Long.MAX_VALUE);
		System.out.println("Min Long: " + Long.MIN_VALUE);
		
		System.out.println("Max Float: " + Float.MAX_VALUE);
		System.out.println("Min Float: " + Float.MIN_VALUE);
		
		System.out.println("Max Double: " + Double.MAX_VALUE);
		System.out.println("Min Double: " + Double.MIN_VALUE);
		
		
		
		int[]array = {5, 7, 9, 3, 4, 15, 11, 2, 44, 17};
		
		int max = array.length;
		int min = array.length;
		
		for (int i: array) {
			if (i < min)
				min = i;
			if (i > max)
				max = i;
		}
		
		System.out.println("min " + min);
		System.out.println("max " + max);
	}
		
	//github//
}
