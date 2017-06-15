package first;

import java.util.Scanner;
import java.lang.Math;

public class Second {

	public static void main(String[] args) {
		Scanner scn  =  new Scanner(System.in);
		
		System.out.println("Введите первое число a");
		int a = scn.nextInt();
		
		System.out.println("Введите второе число b");
		int b = scn.nextInt();
		
		System.out.println("Введите третье число c");
		int c = scn.nextInt();
		
		double d;
		double z;
		double x1;
		double x2;
		
		
		d = Math.pow(b, 2)-4*a*c;
		z = Math.sqrt(d);
		if(z>0){
			if(b == 0 && a != 0){
				x1 = (-b+z)/(2*a);	
				System.out.println(x1);
			}
			else if (a == 0){
				x1 = -(c/b);
				System.out.println(x1);
			}
			else{ 
			x1 = (-b+z)/(2*a);
			x2 = (-b-z)/(2*a);
			System.out.println(x1);
			System.out.println(x2);
			}
		}else if(z == 0){
			x1 = z/(2*a);
			System.out.println(x1);
		}else{
			System.out.println("Корней нет");
		}
	}
}
