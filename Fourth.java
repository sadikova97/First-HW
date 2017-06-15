package first;

import java.util.Random;

public class Fourth {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] a = new int[5][8];
		
		for(int x = 0;x < a.length;x++){
			for(int y = 0;y < a[x].length;y++){
				a[x][y] = rnd.nextInt(199)-99;
				}
			}
		
		for(int x = 0;x < a.length;x++){
			for(int y = 0;y < a[x].length;y++){
				System.out.print(a[x][y] + "\t");
			}
			System.out.println();
				}
		
		int max = a[0][0];
		
		for(int x = 0;x < a.length;x++){
			for(int y = 0;y < a[x].length;y++){
				if(max<a[x][y]){
					max = a[x][y];
				}
				
			}
			}
		System.out.println("\n Максимальный элемент массива=" + max);
		
	}

}
