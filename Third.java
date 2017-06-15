package first;

import java.util.Random;

public class Third {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] a = new int[8][5];
		
		for(int x = 0;x < a.length;x++){
			for(int y = 0;y < a[x].length;y++){
				a[x][y] = rnd.nextInt(89)+10;
				}
			}
	
	for(int x = 0;x < a.length;x++){
		for(int y = 0;y < a[x].length;y++){
			System.out.print(a[x][y] + "\t");
		}
		System.out.println();
			}
	}

}
