package first;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {

		char a, b; 
		short max, min; 
		Scanner in = new Scanner(System.in); 
		System.out.println("¬ведите два числа"); 
		max = in.nextShort(); 
		min = in.nextShort(); 
		if (max < min) { 
		short s = max; 
		max = min; 
		min = s; 
		} 
		for (int i=min; i<=max; i++ ){ 
		System.out.print((char)i+ " "); 
		}

	}

}
