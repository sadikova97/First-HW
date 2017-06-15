package first;

import java.util.Arrays;
import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {

		String arr[] = { "Садикова", "Настя", "староста", "группы", "в", "этом", "университете", "Так", "вот" }; 

		for (int j = 0; j < arr.length; j++) { 
		for (int i = j + 1; i < arr.length; i++) { 
		arr[j] = arr[j].toLowerCase(); 
		if (arr[i].compareTo(arr[j]) < 0) { 
		String t = arr[j]; 
		arr[j] = arr[i]; 
		arr[i] = t; 
		} 
		} 
		System.out.println(arr[j]); 
		} 
		} 
		}