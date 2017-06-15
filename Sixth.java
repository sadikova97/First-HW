package first;

import java.util.ArrayList;
import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		String arr = ""; 
		int a, ost, sum = 0, nov; 
		System.out.println("Введите десятичное число"); 
		a = in.nextInt(); 

		ost = 16; 
		while (a >= 16) { 

		sum++; 
		nov = a / 16; 
		ost = a - nov * 16; 
		a = nov; 

		if (ost < 10) { 
		arr = arr + ((char) (ost + 48)); 
		} else { 
		arr = arr + ((char) (ost + 55)); 

		} 
		} 

		if (a < 10) { 
		arr = arr + ((char) (a + 48)); 

		} else { 
		arr = arr + ((char) (a + 55)); 
		} 

		System.out.println("Ваше число в шестнадцатеричной записи"); 

		String arr2 = ""; 
		int l = arr.length(); 
		for (int i = l - 1; i >= 0; i--) { 
		arr2 = arr2 + arr.substring(i, i + 1); 
		} 
		System.out.print(arr2); 

		} 

		}